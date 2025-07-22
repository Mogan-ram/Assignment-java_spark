use classicmodels;
select  customerNumber, customerName from customers;
select  customerNumber, customerName, contactLastNAME AS names from customers 
order by contactFirstNAME asc;
select city, state, country from customers having state is null;
select customerNumber, customerName from customers 
where contactLastName like 'm%' limit 10; 
select city from customers where customerNumber 
between 50 AND 150;
select distinct country from customers ;
select city, state from customers where country in ('Spain', 'France');
select c.customerName as name,
 c.customerNumber,
 p.customerNumber,
 p.amount
 from customers c
 left join payments p using(customerNumber);
 select customerNumber from customers 
 except
 select customerNumber from payments;
 
 