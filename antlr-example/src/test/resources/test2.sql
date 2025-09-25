-- Arquivo de teste 2: Criação e manipulação de tabelas
CREATE TABLE produtos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL UNIQUE,
    preco REAL DEFAULT 0.0 CHECK (preco >= 0),
    categoria_id INTEGER,
    data_criacao DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

CREATE INDEX idx_produtos_nome ON produtos(nome);

INSERT INTO produtos (nome, preco, categoria_id) VALUES 
    ('Notebook Dell', 2500.00, 1),
    ('Mouse Logitech', 85.50, 2),
    ('Teclado Mecânico', 350.00, 2);

SELECT p.nome, p.preco, c.nome as categoria
FROM produtos p
LEFT JOIN categorias c ON p.categoria_id = c.id
WHERE p.preco BETWEEN 50 AND 1000
ORDER BY p.preco DESC;