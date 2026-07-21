# Write your MySQL query statement below
select user_id, MAX(time_stamp) as last_stamp from Logins where substring(time_stamp, 1, 10) in(
select MAX(substring(time_stamp, 1, 10)) as last_stamp from Logins where 
year(time_stamp) = 2020 group by user_id) group by user_id