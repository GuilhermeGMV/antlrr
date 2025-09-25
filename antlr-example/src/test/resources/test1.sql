-- Arquivo de teste 1: Operações básicas CRUD
SELECT * FROM usuarios WHERE idade > 18;

INSERT INTO usuarios (nome, idade, email) 
VALUES ('João Silva', 25, 'joao@email.com');

UPDATE usuarios 
SET idade = 26, email = 'joao.silva@email.com' 
WHERE nome = 'João Silva';

SELECT nome, idade FROM usuarios 
ORDER BY idade DESC 
LIMIT 10;