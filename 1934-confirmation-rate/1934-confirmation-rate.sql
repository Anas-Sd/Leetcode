# Write your MySQL query statement below
-- select user_id, 
-- (round(select count(action) from Confirmations where action = 'confirmed' group by user_id) / 
-- count(*), 2) as confirmation_rate from Confirmations group by user_id

select s.user_id, round(ifnull(avg(c.action = 'confirmed'), 0), 2) as confirmation_rate from Confirmations c right join Signups s on s.user_id = c.user_id
group by s.user_id