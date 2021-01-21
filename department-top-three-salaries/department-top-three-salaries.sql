/* Write your PL/SQL query statement below */
​
select Department,Employee,Salary from (
select d.name as Department ,e.name as Employee, e.salary as Salary, 
    dense_rank() over( partition by e.departmentId order by e.salary desc) as rank from employee e join department d on e.departmentId = d.id
    
) t where t.rank <=3
