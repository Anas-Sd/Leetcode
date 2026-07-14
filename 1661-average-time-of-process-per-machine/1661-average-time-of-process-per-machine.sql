# Write your MySQL query statement below
select machine_id, round(avg(processing_time),3) as processing_time from
    (select machine_id, process_id, 
        max(case when activity_type = 'end' then timestamp end) - 
        min(case when activity_type='start' then timestamp end)
        as processing_time from Activity group by machine_id,process_id) t
group by machine_id