-- Last updated: 7/16/2026, 7:56:07 PM
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;