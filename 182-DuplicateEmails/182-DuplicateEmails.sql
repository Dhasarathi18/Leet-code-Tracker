-- Last updated: 7/16/2026, 7:58:45 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
