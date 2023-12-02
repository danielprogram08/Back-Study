use VW;

-- Inserir dados na tabela "Fornecedores"
INSERT INTO Fornecedores (FornecedorID, NomeFornecedor, Endereco, Contato, OutrosDetalhes)
VALUES
    (3, 'Fornecedor E', 'Endereço E', 'Contato E', 'Outros detalhes E'),
    (4, 'Fornecedor F', 'Endereço F', 'Contato F', 'Outros detalhes F'),
    (5, 'Fornecedor G', 'Endereço G', 'Contato G', 'Outros detalhes G'),

    (1, 'Fornecedor A', 'Endereço A', 'Contato A', 'Outros detalhes A'),
    (2, 'Fornecedor B', 'Endereço B', 'Contato B', 'Outros detalhes B'),
    -- Adicione mais registros conforme necessário
    (30, 'Fornecedor Z', 'Endereço Z', 'Contato Z', 'Outros detalhes Z');

-- Inserir dados na tabela "Clientes"
INSERT INTO Clientes (ClienteID, NomeCliente, Endereco, Contato, OutrosDetalhes)
VALUES
    (1, 'Cliente A', 'Endereço A', 'Contato A', 'Outros detalhes A'),
    (2, 'Cliente B', 'Endereço B', 'Contato B', 'Outros detalhes B'),
    -- Adicione mais registros conforme necessário
    (30, 'Cliente Z', 'Endereço Z', 'Contato Z', 'Outros detalhes Z');

-- Inserir dados na tabela "Produtos"
INSERT INTO Produtos (ProdutoID, NomeProduto, Descricao, Preco, FornecedorID)
VALUES
    (25, 'Produto 5', 'Descrição do Produto 5', 125.99, 3),
    (27, 'Produto 7', 'Descrição do Produto 7', 724.19, 4),
	(35, 'Produto 5', 'Descrição do Produto 5', 885.91, 5),
    (67, 'Produto 7', 'Descrição do Produto 7', 655.39, 3),
    (5, 'Produto 5', 'Descrição do Produto 5', 115.99, 1),
    (7, 'Produto 7', 'Descrição do Produto 7', 225.99, 2),
	(8, 'Produto 8', 'Descrição do Produto 8', 1335.99, 1),
	(12, 'Produto 12', 'Descrição do Produto 12', 115.99, 30),
	(1, 'Produto 1', 'Descrição do Produto 1', 10.99, 1),
    (2, 'Produto 2', 'Descrição do Produto 2', 19.99, 2),
    -- Adicione mais registros conforme necessário
    (30, 'Produto 30', 'Descrição do Produto 30', 15.99, 30);


-- Inserir dados na tabela "Estoque"
INSERT INTO Estoque (EstoqueID, ProdutoID, QuantidadeEmEstoque)
VALUES
    (3, 5, 300),
	(4, 7, 553),
	(5, 8, 234),
	(6, 12, 206),	
	(1, 1, 100),
    (2, 2, 150),
    -- Adicione mais registros conforme necessário
    (30, 30, 75);

-- Inserir dados na tabela "Vendas"
INSERT INTO Vendas (VendaID, DataVenda, ProdutoID, ClienteID, QuantidadeVenda)
VALUES
    (1, '2023-01-12', 1, 1, 10),
    (2, '2023-02-09', 1, 2, 15),
    (3, '2023-01-07', 2, 30, 7),
    -- Adicione mais registros conforme necessário
    (30, '2023-02-01', 30, 2, 2);
	-- Lembre-se de que as vendas podem ter muitos registros, dependendo do seu uso


-- Inserir dados na tabela "Historico_precos"
INSERT INTO Historico_precos (ProdutoID, DataAtualizacao, PrecoAnterior, NovoPreco)
VALUES
	(1, '2022-01-01', 9.99, 9.19),
	(1, '2022-03-06', 9.19, 9.99),
    (1, '2023-01-01', 9.99, 10.99),
    (1, '2023-02-01', 10.99, 11.99),
    (1, '2023-03-01', 11.99, 12.99),
    -- Adicione mais registros para o Produto 1
    (2, '2023-01-01', 18.99, 19.99),
    (2, '2023-02-01', 19.99, 20.99),
    (2, '2023-03-01', 20.99, 21.99),
    -- Adicione mais registros para o Produto 2
    -- Continue adicionando registros para outros produtos conforme necessário
    (30, '2023-01-01', 14.99, 15.99),
    (30, '2023-02-01', 15.99, 16.99),
    (30, '2023-03-01', 16.99, 17.99);
