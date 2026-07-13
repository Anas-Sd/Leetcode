# Write your MySQL query statement below
select u.name, SUM(t.amount) as balance from Users u join Transactions t
on u.account = t.account group by t.account having sum(t.amount) > 10000