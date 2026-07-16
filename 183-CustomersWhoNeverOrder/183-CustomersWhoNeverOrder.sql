-- Last updated: 7/16/2026, 7:58:43 PM
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);