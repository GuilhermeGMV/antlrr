-- Arquivo de teste 3: Operações avançadas e DDL
DELETE FROM usuarios WHERE idade < 18 OR email IS NULL;

DROP TABLE IF EXISTS temp_usuarios;

CREATE TEMPORARY TABLE temp_usuarios AS
SELECT nome, COUNT(*) as total
FROM usuarios 
GROUP BY nome 
HAVING COUNT(*) > 1;

-- Consulta com subconsulta e funções agregadas  
SELECT 
    cidade,
    COUNT(*) as total_usuarios,
    AVG(idade) as idade_media,
    MAX(idade) as idade_maxima
FROM usuarios 
WHERE cidade IN (
    SELECT cidade 
    FROM cidades 
    WHERE populacao > 100000
)
GROUP BY cidade 
HAVING COUNT(*) > 10
ORDER BY total_usuarios DESC;

-- Comando com CASE
UPDATE usuarios 
SET categoria = 
    CASE 
        WHEN idade < 18 THEN 'Menor'
        WHEN idade BETWEEN 18 AND 60 THEN 'Adulto'
        ELSE 'Senior'
    END
WHERE categoria IS NULL;