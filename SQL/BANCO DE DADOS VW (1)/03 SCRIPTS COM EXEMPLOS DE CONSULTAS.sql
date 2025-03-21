USE VW;

--1. CONSULTAR OS NOMES DOS PRODUTOS E FORNECEDORES
SELECT 
	P.NOMEPRODUTO,
	F.NOMEFORNECEDOR
FROM 
	Produtos P 
	INNER JOIN Fornecedores F ON P.FornecedorID = F.FornecedorID;

/*2. CONSULTAR OS PRODUTOS QUE TIVERAM PRE�OS ALTERADOS, EXIBINDO:
- A QUANTIDADE DE VEZES QUE TEVE ALTERA��O 
- A �LTIMA DATA DE ALTERA��O 
- QUAL O VALOR DO PRE�O ATUAL*/
SELECT 
	P.NOMEPRODUTO,
	COUNT(HP.ProdutoID) 'QTD_ALTERA��ES DE PRE�O',
	CONVERT (VARCHAR, MAX(HP.DATAATUALIZACAO), 103) '�LTIMA ALTERA��O DE PRE�O',
	REPLACE(P.PRECO, '.', ',')'PRE�O ATUAL'
FROM 
	Produtos P 
	INNER JOIN Historico_precos HP ON P.ProdutoID = HP.ProdutoID
GROUP BY
	P.NOMEPRODUTO, P.PRECO
ORDER BY
	P.PRECO DESC;

/*3. CONSULTAR PRODUTOS VENDIDOS, EXIBINDO:
- NOME DO PRODUTO
- NOME DO FORNECEDOR
- A QUANTIDADE DAS VENDAS
- O VALOR TOTAL DAS VENDAS
- QUANTIDADE EM ESTOQUE
*/
SELECT 
	P.NOMEPRODUTO,
	F.NOMEFORNECEDOR,
	E.QuantidadeEmEstoque,
	SUM(V.QUANTIDADEVENDA) 'QTD VENDIDAS',
	SUM(P.PRECO) 'TOTAL VENDAS'	
FROM
	Produtos P 
	INNER JOIN Fornecedores F ON P.FornecedorID = F.FornecedorID
	INNER JOIN Historico_precos HP ON P.ProdutoID = HP.ProdutoID
	INNER JOIN Estoque E ON P.ProdutoID = E.ProdutoID
	INNER JOIN Vendas V ON P.ProdutoID = V.ProdutoID
GROUP BY
	P.NOMEPRODUTO,
	F.NOMEFORNECEDOR,
	E.QuantidadeEmEstoque;

/*4. CONSULTAR PRODUTOS QUE N�O TIVERAM VENDAS, EXIBINDO:
- NOME DO PRODUTO
- NOME DO FORNECEDOR
- PREC0
- QUANTIDADE NO ESTOQUE
*/
SELECT 
	P.NOMEPRODUTO,
	F.NOMEFORNECEDOR, 
	P.PRECO,
	V.QUANTIDADEVENDA,
	E.QuantidadeEmEstoque
FROM
	Produtos P 
	INNER JOIN Fornecedores F ON P.FornecedorID = F.FornecedorID
	INNER JOIN Estoque E ON P.ProdutoID = E.ProdutoID
	LEFT JOIN Vendas V ON P.ProdutoID = V.ProdutoID	
WHERE 
	V.QUANTIDADEVENDA IS NULL

/*5. CONSULTE:
- A QUANTIDADE DE VEZES QUE HOUVE ALTERA��O DE PRE�OS POR FORNECEDOR
- A DATA DA ULTIMA ALTERA��O DE PRE�O
- EXIBA TAMB�M NA MESMA CONSULTA OS FORNECEDORES QUE NUNCA TIVERAM ALTERA��O DE PRE�OS*/
SELECT 
	F.NOMEFORNECEDOR,
	MAX(HP.DATAATUALIZACAO),
	COUNT(HP.NovoPreco) 'QTD ALTERA��ES DE PRE�OS'
FROM
	Produtos P 
	INNER JOIN Fornecedores F ON P.FornecedorID = F.FornecedorID
	LEFT JOIN Historico_precos HP ON P.ProdutoID = HP.ProdutoID
GROUP BY
	F.NOMEFORNECEDOR
ORDER BY 
	F.NOMEFORNECEDOR;

/*6.CONSULTE:
- A QUANTIDADE DE VEZES QUE HOUVE ALTERA��O DE PRE�OS POR FORNECEDOR
- A DATA DA ULTIMA ALTERA��O DE PRE�O
- EXIBIR TAMB�M NA MESMA CONSULTA OS FORNECEDORES QUE NUNCA TIVERAM ALTERA��O DE PRE�OS
- EXIBIR SOMENTE QUEM TEVE ALTERA��O DE PRE�O ENTRE 0 (ZERO) E 3 (TR�S)
*/
SELECT 
	F.NOMEFORNECEDOR,
	MAX(HP.DATAATUALIZACAO),
	COUNT(HP.NovoPreco) 'QTD ALTERA��ES DE PRE�OS'
FROM
	Produtos P 
	INNER JOIN Fornecedores F ON P.FornecedorID = F.FornecedorID
	LEFT JOIN Historico_precos HP ON P.ProdutoID = HP.ProdutoID
GROUP BY
	F.NOMEFORNECEDOR
HAVING
	COUNT(HP.NovoPreco) >= 0 AND COUNT(HP.NovoPreco) <=3
ORDER BY 
	F.NOMEFORNECEDOR;

/*7.REALIZE A ATUALIZA��O DOS PRE�OS DOS PRODUTO QUE POSSUI O C�DIGO 1:
- O NOVO VALOR DEVE SER A M�DIA DOS �LTIMOS PRE�OS ANTERIORES QUE CONSTAM NA TABELA HIST�RICO DE PRE�OS
- GUARDE O NOVO VALOR NA TABELA HISTORICO DE PRE�OS E ATUALIZE NA TABELA DE PRODUTOS
*/
DECLARE 
	@PRECOATUAL DECIMAL(10,2) = (SELECT PRECO FROM PRODUTOS WHERE ProdutoID = 1),
	@PRECONOVO DECIMAL(10,2) = (
	SELECT 
		CONVERT(DECIMAL(15,2), AVG(HP.PrecoAnterior)) --<==eSSE COMANDO SERVER PARA EXIBIR SOMENTE 2 CASAS DECIMAIS
	FROM
		Historico_precos HP 
		INNER JOIN Vendas V ON HP.ProdutoID = V.ProdutoID
	WHERE 
		V.ProdutoID = 1
		);
BEGIN
	UPDATE Produtos SET PRECO = @PRECONOVO
	WHERE ProdutoID = 1;

	INSERT INTO Historico_precos (ProdutoID, DataAtualizacao, PrecoAnterior, NovoPreco)
	VALUES (1, GETDATE(), @PRECOATUAL, @PRECONOVO);
END;

--CRIA��O DE PROCEDURES;
CREATE PROCEDURE CONSULTA_PRODUTOS AS
BEGIN

SELECT * FROM Produtos

END;

CONSULTA_PRODUTOS;

/*
REALIZAR UMA CONSULTA QUE RETORNE:
	- NOMES DOS CLIENTES
	- COM OS NOMES DOS PRODUTOS QUE FORAM COMPRADOS
	- INFORMANDO TAMB�M O NOME DO FORNECEDOR DO PRODUTO
*/
SELECT
	C.NOMECLIENTE,
	V.ProdutoID,
	P.NomeProduto,
	P.FornecedorID
FROM
	Clientes C
	INNER JOIN VENDAS V ON V.ClienteID = C.ClienteID
	INNER JOIN Produtos P ON P.ProdutoID = V.ProdutoID
	INNER JOIN Fornecedores F ON F.FornecedorID = P.FornecedorID;