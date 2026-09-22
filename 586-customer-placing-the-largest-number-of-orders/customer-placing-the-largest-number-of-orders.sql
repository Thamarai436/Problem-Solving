select a.customer_number
from Orders a
join Orders b
on a.order_number = b.order_number
group by b.customer_number
order by count(b.customer_number) desc
LIMIT 1;