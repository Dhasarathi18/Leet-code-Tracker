-- Last updated: 7/16/2026, 7:57:27 PM
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;
