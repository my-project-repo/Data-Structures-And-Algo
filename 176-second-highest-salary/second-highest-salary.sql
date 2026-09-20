# Write your MySQL query statement below
SELECT (
    SELECT salary
    FROM Employee e
    WHERE salary < (SELECT MAX(salary) FROM Employee)
    ORDER BY salary DESC
    LIMIT 1
) AS SecondHighestSalary;