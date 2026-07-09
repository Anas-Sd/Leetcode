# Write your MySQL query statement below
select ip, sum(
case 
    when substring_index(ip,'.',1)>255 
    or substring_index(substring_index(ip,'.',2),'.',-1)>255
    or substring_index(substring_index(ip,'.',3),'.',-1)>255 
    or substring_index(ip,'.',-1)>255 

or

substring_index(ip,'.',1) regexp '^0[0-9]' 
    or substring_index(substring_index(ip,'.',2),'.',-1) regexp '^0[0-9]'
    or substring_index(substring_index(ip,'.',3),'.',-1) regexp '^0[0-9]' 
    or substring_index(ip,'.',-1) regexp '^0[0-9]' 

or

length(ip) - length(replace(ip,'.','')) !=3
    then 1 else 0 end) as invalid_count
from logs group by ip HAVING invalid_count > 0  order by invalid_count desc, ip desc

