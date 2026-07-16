-- Last updated: 7/16/2026, 7:55:56 PM
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
