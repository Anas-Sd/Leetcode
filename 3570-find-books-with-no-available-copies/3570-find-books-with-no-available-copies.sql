# Write your MySQL query statement below

select book_id, title, author, genre, publication_year, total_copies as current_borrowers 
from library_books
where book_id in(
    select b.book_id from borrowing_records b join library_books l 
    on b.book_id = l.book_id where b.return_date 
    is null group by b.book_id, l.total_copies having count(b.book_id) = l.total_copies
)
order by current_borrowers desc, title