-- Last updated: 11/08/2026, 16:06:33
SELECT *
FROM Cinema
WHERE description <> 'boring'
  AND id % 2 = 1
ORDER BY rating DESC;
