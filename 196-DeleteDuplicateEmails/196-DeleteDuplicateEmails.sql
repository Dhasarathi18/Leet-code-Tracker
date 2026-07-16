-- Last updated: 7/16/2026, 7:58:37 PM
DELETE p1
FROM Person p1, Person p2
WHERE p1.email = p2.email
AND p1.id > p2.id;
