-- Last updated: 7/16/2026, 7:57:20 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(*) >= 5;