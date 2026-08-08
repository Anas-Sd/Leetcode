# Write your MySQL query statement below
select customer_id from customer_transactions
group by customer_id having
avg(transaction_type = 'refund') < 0.20 && datediff(max(transaction_date), min(transaction_date)) >= 30 && count(*) >=3