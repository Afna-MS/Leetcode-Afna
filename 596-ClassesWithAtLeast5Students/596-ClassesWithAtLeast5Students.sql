-- Last updated: 11/08/2026, 16:07:18
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;
