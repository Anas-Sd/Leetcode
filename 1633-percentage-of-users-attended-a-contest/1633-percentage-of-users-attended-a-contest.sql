# Write your MySQL query statement below
-- select c.contest_id, (
--     case when count(distinct(u.user_id)) = 3 then 100.0 end,
--     case when count(distinct(u.user_id)) = 2 then 66.67 end,
--     case when count(distinct(u.user_id)) = 1 then 33.33 end) as percentage
--     from Register c join Users u on u.user_id = c.user_id 
--     group by contest_id

select contest_id, Round((count(*)/(select count(*) from Users))*100,2) as percentage from Register
group by contest_id order by percentage desc, contest_id