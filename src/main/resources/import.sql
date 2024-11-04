INSERT INTO Cliente (nome, cpf, email, telefone) VALUES 
('João da Silva', '12345678901', 'joao@example.com', '123456789'),
('Maria Oliveira', '98765432100', 'maria@example.com', '987654321'),
('Carlos Pereira', '11122233344', 'carlos@example.com', '222333444'),
('Ana Souza', '55566677788', 'ana@example.com', '333444555'),
('Fernanda Lima', '99988877766', 'fernanda@example.com', '444555666');



INSERT INTO Produto (nome, preco, pedido_id) VALUES 
('Produto A', 29.99, NULL),  
('Produto B', 49.99, NULL),
('Produto C', 19.99, NULL),
('Produto D', 99.99, NULL),
('Produto E', 15.50, NULL);


INSERT INTO fornecedor (razao_social, nome_fantasia, cnpj, email, telefone) VALUES 
('Fornecedor A', 'Fantasia A', '12345678000195', 'fornecedorA@example.com', '123456789'),
('Fornecedor B', 'Fantasia B', '98765432000196', 'fornecedorB@example.com', '987654321'),
('Fornecedor C', 'Fantasia C', '11122233000197', 'fornecedorC@example.com', '222333444'),
('Fornecedor D', 'Fantasia D', '55566677000198', 'fornecedorD@example.com', '333444555'),
('Fornecedor E', 'Fantasia E', '99988888000199', 'fornecedorE@example.com', '444555666');

INSERT INTO Pedido (nome, cliente_codigo, fornecedor_codigo, data_de_inclusao, data_de_alteracao) VALUES 
('Pedido 1', 1, 1, '2024-01-01', '2024-01-02'),
('Pedido 2', 2, 1, '2024-02-01', '2024-02-02'),
('Pedido 3', 1, 2, '2024-03-01', '2024-03-02'),
('Pedido 4', 3, 2, '2024-04-01', '2024-04-02'),
('Pedido 5', 2, 3, '2024-05-01', '2024-05-02');


INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (1, 1, 2, 500.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (1, 2, 1, 1200.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (2, 3, 5, 150.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (3, 4, 3, 250.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (4, 5, 4, 400.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (5, 6, 10, 75.00);



