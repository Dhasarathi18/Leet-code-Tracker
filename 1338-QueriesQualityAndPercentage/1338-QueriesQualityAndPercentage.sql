-- Last updated: 7/16/2026, 7:55:36 PM
# Write your MySQL query statement below
SELECT
    query_name,
    ROUND(AVG(rating * 1.0 / position), 2) AS quality,
    ROUND(AVG(CASE WHEN rating < 3 THEN 100.0 ELSE 0 END), 2) AS poor_query_percentage
FROM Queries
GROUP BY query_name;