-- Crie um novo banco de dados
CREATE DATABASE VW;

-- Use o banco de dados
USE VW;

-- Crie a tabela "Fornecedores"
CREATE TABLE Fornecedores (
    FornecedorID INT PRIMARY KEY,
    NomeFornecedor VARCHAR(255),
    Endereco VARCHAR(255),
    Contato VARCHAR(255),
    OutrosDetalhes VARCHAR(255)
);

-- Crie a tabela "Clientes"
CREATE TABLE Clientes (
    ClienteID INT PRIMARY KEY,
    NomeCliente VARCHAR(255),
    Endereco VARCHAR(255),
    Contato VARCHAR(255),
    OutrosDetalhes VARCHAR(255)
)

-- Crie a tabela "Produtos"
CREATE TABLE Produtos (
    ProdutoID INT PRIMARY KEY,
    NomeProduto VARCHAR(255),
    Descricao VARCHAR(255),
    Preco DECIMAL(10, 2),
    FornecedorID INT,
    FOREIGN KEY (FornecedorID) REFERENCES Fornecedores (FornecedorID)
);

-- Crie a tabela "Estoque"
CREATE TABLE Estoque (
    EstoqueID INT PRIMARY KEY,
    ProdutoID INT,
    QuantidadeEmEstoque INT,
    FOREIGN KEY (ProdutoID) REFERENCES Produtos (ProdutoID)
);

-- Crie a tabela "Vendas"
CREATE TABLE Vendas (
    VendaID INT PRIMARY KEY,
    DataVenda DATETIME,
    ProdutoID INT,
	ClienteID INT,
    QuantidadeVenda INT,
	FOREIGN KEY (ProdutoID) REFERENCES Produtos (ProdutoID),
    FOREIGN KEY (ClienteID) REFERENCES Clientes (ClienteID)
);

-- Crie a tabela "Historico_precos"
CREATE TABLE Historico_precos (
    ProdutoID INT,
    DataAtualizacao DATETIME,
    PrecoAnterior DECIMAL(10, 2),
    NovoPreco DECIMAL(10, 2),
    FOREIGN KEY (ProdutoID) REFERENCES Produtos (ProdutoID)
);



