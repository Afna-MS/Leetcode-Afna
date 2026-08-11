-- Last updated: 11/08/2026, 16:06:54
SELECT x, y, z,
       CASE 
           WHEN x + y > z AND x + z > y AND y + z > x 
           THEN 'Yes' 
           ELSE 'No' 
       END AS triangle
FROM Triangle;
