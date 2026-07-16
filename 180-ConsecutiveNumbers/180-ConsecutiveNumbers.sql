-- Last updated: 7/16/2026, 7:58:48 PM
SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2
    ON l1.id = l2.id - 1
JOIN Logs l3
    ON l2.id = l3.id - 1
WHERE l1.num = l2.num
  AND l2.num = l3.num;
