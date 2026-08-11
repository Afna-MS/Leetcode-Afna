-- Last updated: 11/08/2026, 16:02:21
SELECT person_name
FROM (
    SELECT person_id,
           person_name,
           SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;
