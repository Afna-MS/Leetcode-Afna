-- Last updated: 11/08/2026, 16:07:00
SELECT id,
       CASE
           WHEN p_id IS NULL THEN 'Root'
           WHEN id NOT IN (SELECT p_id FROM Tree WHERE p_id IS NOT NULL) THEN 'Leaf'
           ELSE 'Inner'
       END AS Type
FROM Tree
ORDER BY id;
