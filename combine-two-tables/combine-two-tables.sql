/* Write your PL/SQL query statement below */

select p.FirstName,p.LastName,a.City,a.State
from Person p left join Address a on p.personId = a.personId
