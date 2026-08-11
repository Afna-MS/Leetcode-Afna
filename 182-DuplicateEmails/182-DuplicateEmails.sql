-- Last updated: 11/08/2026, 16:13:26
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;
