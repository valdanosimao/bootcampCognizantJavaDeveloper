package com.bootcampCognizantJavaDeveloper.SQL;

public class Anotacoes {	
	
//		==SELECT==
//	
//	SELECT * FROM person.Person; (Seleciona todas as colunas)
//	
//	SELECT Title FROM person.person (Seleciona apenas a coluna Escolhida, ou seja filtra)
//	SELECT FirstName FROM person.Person;
//	SELECT LastName FROM person.Person;
//	SELECT FirstName, LastName FROM person.Person; (duas ao mesmo tempo)
//	
//	SELECT * FROM person.EmailAddress; (Vai retornar toda informa��es desta tabela)
//	*********************************************************************************
//	
//					==DISTINCT==
//	(n�o retorna os dados duplicados)
//	
//	SELECT DISTINCT FirstName FROM person.Person; (Vai retorna os nomes N�O duplicados)
//	
//	*********************************************************************************
//					==WHERE==
//	
//	(Condi��o =, >, <, >=, <>(diferente) AND, OR, entre outros operadores l�gicos)
//	
//	SELECT *
//	FROM person.Person
//	WHERE LastName = 'miller'; (vai retornar apenas os sobre nomes miller)
//	
//	SELECT *
//	FROM person.Person
//	WHERE LastName = 'miller' and FirstName = 'ana';
//	
//	SELECT * FROM Production.Product
//	WHERE Color = 'blue' or Color = 'black';
//	
//	SELECT * FROM Production.Product
//	WHERE ListPrice > 1500;
//	
//	SELECT * FROM Production.Product
//	WHERE Color <> 'red'; (vai retornar apenas os produtos que N�O s�o RED)
//	
//	SELECT Name FROM Production.Product
//	WHERE Weight > 500 and Weight <= 700; (Nome dos produtos com o peso entre 500kg e 700kg)
//	
//	SELECT * FROM HumanResources.Employee
//	WHERE MaritalStatus = 'M' and SalariedFlag = 1; (retorna os casados e asalariados)
//	
//	SELECT * FROM Person.Person
//	WHERE FirstName = 'Peter' and LastName = 'Krebs';(procurei a pessoa)
//	
//	SELECT * FROM Person.EmailAddress (depois pelo id achei o endere�o)
//	WHERE BusinessEntityID = 26;
//	
//	*********************************************************************************
//					==COUNT==
//	SELECT count(*)
//	FROM Person.Person (informa quantidade de tabelas)
//	
//	SELECT count(title) (informa quantidade de titulos)
//	FROM Person.Person
//	
//	SELECT count(DISTINCT title)
//	FROM Person.Person
//	
//	SELECT count (*)
//	FROM Production.Product; (quantidade de produtos)
//	
//	SELECT count (Size)
//	FROM Production.Product; (informa quantidade de tamanho)
//	
//	*********************************************************************************
//					==TOP==
//	SELECT TOP 10 *
//	FROM Production.Product (retorna as primeira 10 entradas do banco de dados)
//	
//	
//	*********************************************************************************
//					==ORDER BY==
//	
//	SELECT * 
//	FROM Person.Person      	asc(crescente) desc(descrecente)
//	ORDER BY FirstName asc (Ordenando o primeiro nome por ordem acrescente (asc) )
//	
//	SELECT * 
//	FROM Person.Person      	asc(crescente) desc(descrecente)
//	ORDER BY FirstName asc
//	
//	SELECT * 
//	FROM Person.Person
//	ORDER BY FirstName asc, LastName desc (usando dois colunas, uma asc e outra desc)
//	
//	SELECT FirstName, LastName
//	FROM Person.Person
//	ORDER BY FirstName asc, LastName desc  (usando dois colunas, uma asc e outra desc)
//	
//	SELECT TOP 10 ProductID
//	FROM Production.Product
//	ORDER BY ListPrice desc (Filtrando pelo Id do produto, por ordem descrecente)
//	
//	SELECT ProductID, Name , ProductNumber
//	FROM Production.Product
//	WHERE ProductID >= 0 and ProductID <= 4
//	
//	*********************************************************************************
//					==BETWEEN== (Usando para encontrar valor entre um valor m�nimo e m�ximo)
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice between 1000 and 1500;  (Retorna Lista de pre�o, entre(between) 1000 e 1500)
//	
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice NOT between 1000 and 1500; (faz o oposto, retorna apenas que N�O est�o entre 1000 e 1500
//	
//	SELECT *
//	FROM HumanResources.Employee
//	WHERE HireDate BETWEEN '2009/01/01' and '2010/01/01' (Retorna contratados entre 2009 e 2010)
//	/*ORDER BY Hiredate*/ 
//	
//	
//	*********************************************************************************
//					==IN== (Usamos junto com o WHERE, para verificar se um valor correspondem com qualquer valor passado na lista de valores
//	
//	SELECT *
//	FROM Person.Person
//	WHERE BusinessEntityID IN (2,7,13) (Retorna o id 2,7,13 ou (seja MAIS R�PIDO))
//	
//	SELECT *
//	FROM Person.Person
//	WHERE BusinessEntityID NOT IN (2,7,13) (Oposto de cima)
//	
//	� MELHOR USAR O IN JUNTO COM O WHERE, AO INV�S DE FAZER V�RIAS CONDI��ES
//	
//	
//	*********************************************************************************
//					==LIKE== (Vamos dizer que voc� quer encontrar uma pessoa no banco de dados que vc sabe q o nome era ovi...alguma coisa)
//	
//	SELECT *
//	FROM Person.Person
//	WHERE FirstName like 'ovi%' (s� lembra do IN�CIO do nome no final tem que inserir o  %)
//	WHERE FirstName like '%to' (s� lembra do FINAL do nome tem que inserir o  % ANTES DO NOME)
//	WHERE FirstName like '%essa%' (s� lembra o MEIO do nome, quem que inserir dois %% e o que lembra no meio)
//	WHERE FirstName like '%ro_' (Se limite apenas um caracter depois do 'Ro')
//	
//	*********************************************************************************
//					==MIN MAX SUM AVG== (Fun��es de agrega��o basicamente agregam ou combinam dados de uma tabela em 1 resultado s�) 
//	
//	SELECT TOP 10 SUM(linetotal)
//	FROM Sales.SalesOrderDetail (Somou toda a coluna linetotal)
//	
//	SELECT TOP 10 SUM(linetotal) AS "Soma" (Quando a coluna n�o tiver nome, colocar um apelido desta forma AS "nomeApelido")
//	FROM Sales.SalesOrderDetail
//	
//	SELECT TOP 10 MIN(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna o menor valor cadastrado)
//	
//	SELECT TOP 10 MAX(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna o valor m�ximo cadastrado)
//	
//	SELECT TOP 10 AVG(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna a m�dia)
//	
//	*********************************************************************************
//					==GROUP BY== 
//	(Basicamente divide o resultado da sua pesquisa em grupos, para cada grupo que vc aplicar
//	uma fun��o de agrega��o, por exemplo: calcular a soma de itens, contar o n�meros de itens naquele grupo)
//	
//	SELECT SpecialOfferId, SUM(UnitPrice) AS "SOMA"
//	FROM Sales.SalesOrderDetail
//	GROUP BY SpecialOfferID
//	
//	SELECT FirstName, COUNT(FirstName)
//	FROM Person.Person
//	GROUP BY FirstName;  (agrupa os nomes e conta quantos nomes tem de cada)
//	
//	SELECT color, AVG(LISTPRICE)
//	FROM Production.Product
//	GROUP BY color;   (m�dia de pre�os por cor)
//	
//	SELECT color, AVG(LISTPRICE) AS "PRECO"
//	FROM Production.Product
//	WHERE Color = 'Silver'
//	GROUP BY color;   (m�dia de pre�os por cor silver)
//	
//	*********************************************************************************
//					==HAVING== 
//	(Basicamente muito usado em jun��o do group by, para filtrar resultados de um agrupamento.
//	De uma forma mais simples, ele � basicamente um where para dados agrupados.
//	a grande diferen�a entre having e where, � que o group by � aplicado depois que os dados j� foram agrupados,
//	enquanto o where � aplicado antes dos dados serem agrupados)
//	
//	EX: Vamos dizer que queremos saber quais nomes no sistema tem ocorrencia maior que 10 vezes
//	SELECT FirstName, COUNT(FirstName) AS "Qtd"
//	FROM Person.Person
//	GROUP BY FirstName
//	Having COUNT(FirstName) > 10 (S� consigo usar o having ap�s o group by
//	
//	Por exemplo queremos saber quais produtos que no total de vendas entre 126k  e 500k
	
//	*********************************************************************************
//					==AS== 
//	serve para renomear as colunas
//	SELECT TOP 10 ListPrice as "Pre�o" (caso apenas uma palavra ,n�o precisa aspas)
//	FROM Production.Product
//	
//	SELECT TOP 10 FirstName As "Nome", LastName As "SobreNome"
//	FROM Person.person
//	
//	*********************************************************************************
//					==Inner Join==  (ESTUDAR MAIS SOBRE JOIN)
//	Existem 3 tipos de Joins:
//	INNER JOIN, OUTER JOIN e SELF-JOIN
//	
//	== INNER JOIN
//	Inner Join retorna apenas os resultados que correspondem(Existem) tanto na 
//	Tabala A como na Tabela B
//	_________________________
//	|  	A			B		|
//	| id Nome	 id Nome	|
//	|1 robo		1 Espada	|
//	|2 Macaco	2 Robo		|
//	|3 Samurai	3 Mario		|
//	|4 Monitor	4 Samurai	|
//	|_______________________|
//	SELECT *
//	FROM TabelaA
//	INNER JOIN TabelaB
//	ON TabelaA.nome = TabelaB.nome
//	
//	Sendo assim vai retornar apenas os nomes ROBO e SAMURAI
//	
//	== FULL OUTER JOIN
//	Full outer join retorna um conjunto de todos registros correspondentes
//	da TabelaA e TabelaB quando s�o iguais. E al�m disso se n�o houver valores
//	correspondentes, ele simplismente ir� preencher esses lado com null
//	_________________________
//	|  	A			B		|
//	| id Nome	 id Nome	|
//	|1 robo		1 Espada	|
//	|2 Macaco	2 Robo		|
//	|3 Samurai	3 Mario		|
//	|4 Monitor	4 Samurai	|
//	|_______________________|
//	SELECT *
//	FROM Tabe�aA	
//	FULL OUTER JOIN Tabela B
//	ON TabelaA.nome = TabelaB.nome
//
//	== LEFT OUTER JOIN
//	Left outer Join retorna um conjunto de todos os registros
//	da tabelaA, e alem disso, os registros correspondentes(quando
//	disponiveis) na TabelaB. Se n�o houver registros correspondentes
//	ele simplesmente vai preencher com "null"
//	
//	_________________________
//	|  	A			B		|
//	| id Nome	 id Nome	|
//	|1 robo		1 Espada	|
//	|2 Macaco	2 Robo		|
//	|3 Samurai	3 Mario		|
//	|4 Monitor	4 Samurai	|
//	|_______________________|
//	SELECT *
//	FROM TabelaA
//	LEFT JOIN TabelaB
//	ON TabelaA.nome = TabelaB.nome
//	
//	-- quero descobrir quais pessoas tem um cart�o de cr�dito registrado
//	
//	*********************************************************************************
//	==UNION== (O operador unium combina dois ou mais resultados de um select em um resultado apenas)
// 	SELECT FirstName, Title
//	FROM Person.Person
//	WHERE Title = 'Mr.'
//	UNION
//	SELECT FirstName, Title
//	FROM Person.Person
//	WHERE MiddleName = 'A'
//	
//	Ele vai remover os dados duplicados e vai juntar as informa��es da tabela
//
//	*********************************************************************************
//	==DATEPART== 
//	SELECT SalesOrderID, DATEPART(month,OrderDate) as "Mes"
//	FROM Sales.SalesOrderHeader
//
//	*********************************************************************************
//	==MANIPULA��O STRING==  
//
//  concatena��o	
//	SELECT CONCAT(FirstName,' ', LastName)  
//	FROM Person.Person
//	
//	uppercase
//	SELECT UPPER(FirstName)
//	FROM Person.Person
//
//	lowercase
//	SELECT LOWER(FirstName)
//	FROM Person.Person
//
//	tamanho dos caracter
//	SELECT LEN(FirstName)
//	FROM Person.Person
//	
//	Abreviar
//  SELECT FirstName, SUBSTRING(FirstName,1,3)
//	 FROM Person.Person
//	
//	Substituir
//	SELECT REPLACE(ProductNumber, '-', '#')
//	FROM Production.Product
//	
//	*********************************************************************************
//	==OPERA��ES MATEM�TICAS==  
//	
// 	SELECT UnitPrice + LineTotal
//	FROM Sales.SalesOrderDetail		//soma
//	
//	SELECT UnitPrice - LineTotal
//	FROM Sales.SalesOrderDetail		//subtra��o
//	
//	SELECT UnitPrice * LineTotal
//	FROM Sales.SalesOrderDetail  //multiplica��o
//
//	SELECT AVG(LineTotal)
//	FROM Sales.SalesOrderDetail  //m�dia
//	
//	SELECT MIN(LineTotal)
//	FROM Sales.SalesOrderDetail  //valor m�nimo e o MAX para valor m�ximo
//	
//	SELECT ROUND(LineTotal,2)
//	FROM Sales.SalesOrderDetail  //arredondamento, casa d�cimal
//	
//	*********************************************************************************
//	==SUBQUERY OU SUBSELECT==  (De forma geral � um select dentro de outro select)
//
//	--Monte um relat�rio para min de todos os produtos cadastrado que tem o pre�o acima da m�dia
//	
//	==usando dois selects
//	SELECT AVG(ListPrice)
//	FROM Production.Product
//
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice > 438.66
//	
//	==usando subquery
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice > (SELECT AVG(ListPrice) FROM Production.Product)
//
//	*********************************************************************************
//	==SELF JOIN==
//	
//	--Eu quero todos os clientes que moram na mesma regi�o
//	SELECT A.ContactName, B.ContactName
//	FROM CUSTOMERS A, CUSTOMERS B
//	WHERE A.Region = B.Region
//	
//	*********************************************************************************
//	==TIPOS DE DADOS==
//	1 booleanos
//	2 cacactere
//	3 n�meros
//	4 temporais
//	
//	#Booleanos BIT (Por padr�o ele � inicializado como numero, e pode receber tanto 1 quanto 0 ou null
//	
//	#Caracteres CHAR (Permite inserie at� uma quandidade fixa de caracteres e sempre ocupa todo o espa�o reservado 10/50)
//	Tamanho vari�veis - varchar ou nvarchar, permite inserir at� uma quantidade que for definida, porem s� usa o espa�o 
//	que for preenchido 10/50
//	
//	#Numeros 
//	TINYINT - n�o tem parte valor fracionados (ex: 1.43 etc) 
//	SMALLINT - mesma coisa porem limite maior
//	INT - mesma coisa limite maior
//	BIGINT - mesma coisa limite maior
//	NUMERIC OU DECIMAL - valores exatos, porem permite ter parte fracionados, que tambem pode ser especificado a prescis�o
//  escala (escala � o n�mero de digitos na parte fracional) -ex: NUMERIC(5,2)
//	
//	#Valores Aproximados
//	Real - tem precis�o aproximada de at� 15 digitos
//	Float - mesmo conteiro do real
//	
//	#Temporais
//	DATE - armazena data no formato aaaa/mm/dd
//	DATETIME - armazena data e horas no formato  aaaa/mm/dd:hh:mm:ss	
//	DATETIME2 - data e horas com adi��o de milissegundos no formato aaaa/mm/dd:hh:mm:ssssss
//	SMALLDATETIME - data e hora nos respeitando o limite entre '1900-01-01:00:00:00' at� '2079-06-06:23:59:59'
//	TIME - horas, minutos, segundos e milissegundos respeitando o limite de '00:00:00:00000000' to '23-59-59-999'
//	DATETIMEOFSET - permite armazenar informa��es de data e horas incluindo o fuso hor�rio
//	
//	*********************************************************************************
//	==CHAVE PRIMARIA E ESTRANGEIRA==
//	
//
//
//	
//	
//	
//	
//	
//	
//
//
//	
//	
//	
//	
//		
//	
//
//
//	
//	
//	
//	
//		
//	
//
//
//	
//	
//	
//	
//		
//	
//
//
//	
//	
//	
//	
//		
//	
//
//
//	
//	
//	
//	
//		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
