-- Last updated: 7/16/2026, 7:55:11 PM

SELECT
    eu.unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;

