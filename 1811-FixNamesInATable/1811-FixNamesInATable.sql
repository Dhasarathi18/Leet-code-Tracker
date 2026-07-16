-- Last updated: 7/16/2026, 7:55:07 PM
# Write your MySQL query statement below
SELECT
    user_id,
    CONCAT(
        UPPER(LEFT(name, 1)),
        LOWER(SUBSTRING(name, 2))
    ) AS name
FROM Users
ORDER BY user_id;