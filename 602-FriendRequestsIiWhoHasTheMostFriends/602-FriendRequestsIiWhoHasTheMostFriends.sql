-- Last updated: 7/16/2026, 7:57:17 PM
SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id AS id
    FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id
    FROM RequestAccepted
) AS friends
GROUP BY id
ORDER BY num DESC
LIMIT 1;
