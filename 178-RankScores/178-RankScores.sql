-- Last updated: 11/08/2026, 16:13:34
SELECT Score,
       DENSE_RANK() OVER (ORDER BY Score DESC) AS `Rank`
FROM Scores;
