-- Last updated: 11/08/2026, 16:06:24
UPDATE Salary
SET sex = CASE 
             WHEN sex = 'm' THEN 'f'
             ELSE 'm'
          END;
