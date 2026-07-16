-- Last updated: 7/16/2026, 7:57:31 PM
SELECT e.name
FROM Employee e
JOIN Employee emp
ON e.id = emp.managerId
GROUP BY e.id, e.name
HAVING COUNT(emp.managerId) >= 5;
