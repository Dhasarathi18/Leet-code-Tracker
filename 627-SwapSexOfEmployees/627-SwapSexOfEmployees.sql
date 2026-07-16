-- Last updated: 7/16/2026, 7:56:47 PM
UPDATE Salary
SET sex = CASE
            WHEN sex = 'm' THEN 'f'
            ELSE 'm'
          END;