-- Last updated: 7/16/2026, 7:58:47 PM
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;
