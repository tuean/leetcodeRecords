

select Name as Customers from Customers a where a.id not in (select CustomerId from Orders)