-- Last updated: 11/08/2026, 16:07:53
SELECT e.Name
FROM Employee e
JOIN (
    SELECT ManagerId
    FROM Employee
    WHERE ManagerId IS NOT NULL
    GROUP BY ManagerId
    HAVING COUNT(*) >= 5
) m
ON e.Id = m.ManagerId;
