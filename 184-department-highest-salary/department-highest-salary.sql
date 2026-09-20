# Write your MySQL query statement below
WITH cte as (SELECT departmentId as 'deptid' , MAX(salary) as 'maxsal' FROM
Employee GROUP BY departmentId )


SELECT d.name as Department , e.name as Employee , e.salary FROM Employee e JOIN Department d ON e.departmentId = d.id WHERE e.salary = (SELECT maxsal FROM cte WHERE e.departmentId = deptid);