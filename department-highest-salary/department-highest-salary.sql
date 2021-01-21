/* Write your PL/SQL query statement below */
​
--select d.name as department ,e.name as Employee,e.salary as Salary
--select *
​
select Department, Employee,Salary from (
select 
    d.name as Department,
    e.name as Employee,
    e.salary as Salary,
    dense_rank() over( partition by e.departmentId order by e.salary desc) as tk
    from Employee e join Department d on e.departmentId = d.id
) t where tk =1;
