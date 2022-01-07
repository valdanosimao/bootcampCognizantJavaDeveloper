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
//	SELECT * FROM person.EmailAddress; (Vai retornar toda informações desta tabela)
//	*********************************************************************************
//	
//					==DISTINCT==
//	(não retorna os dados duplicados)
//	
//	SELECT DISTINCT FirstName FROM person.Person; (Vai retorna os nomes NÂO duplicados)
//	
//	*********************************************************************************
//					==WHERE==
//	
//	(Condição =, >, <, >=, <>(diferente) AND, OR, entre outros operadores lógicos)
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
//	WHERE Color <> 'red'; (vai retornar apenas os produtos que NÃO são RED)
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
//	SELECT * FROM Person.EmailAddress (depois pelo id achei o endereço)
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
//					==BETWEEN== (Usando para encontrar valor entre um valor mínimo e máximo)
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice between 1000 and 1500;  (Retorna Lista de preço, entre(between) 1000 e 1500)
//	
//	SELECT *
//	FROM Production.Product
//	WHERE ListPrice NOT between 1000 and 1500; (faz o oposto, retorna apenas que NÂO estão entre 1000 e 1500
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
//	WHERE BusinessEntityID IN (2,7,13) (Retorna o id 2,7,13 ou (seja MAIS RÁPIDO))
//	
//	SELECT *
//	FROM Person.Person
//	WHERE BusinessEntityID NOT IN (2,7,13) (Oposto de cima)
//	
//	É MELHOR USAR O IN JUNTO COM O WHERE, AO INVÉS DE FAZER VÁRIAS CONDIÇÕES
//	
//	
//	*********************************************************************************
//					==LIKE== (Vamos dizer que você quer encontrar uma pessoa no banco de dados que vc sabe q o nome era ovi...alguma coisa)
//	
//	SELECT *
//	FROM Person.Person
//	WHERE FirstName like 'ovi%' (só lembra do INÍCIO do nome no final tem que inserir o  %)
//	WHERE FirstName like '%to' (só lembra do FINAL do nome tem que inserir o  % ANTES DO NOME)
//	WHERE FirstName like '%essa%' (só lembra o MEIO do nome, quem que inserir dois %% e o que lembra no meio)
//	WHERE FirstName like '%ro_' (Se limite apenas um caracter depois do 'Ro')
//	
//	*********************************************************************************
//					==MIN MAX SUM AVG== (Funções de agregação basicamente agregam ou combinam dados de uma tabela em 1 resultado só) 
//	
//	SELECT TOP 10 SUM(linetotal)
//	FROM Sales.SalesOrderDetail (Somou toda a coluna linetotal)
//	
//	SELECT TOP 10 SUM(linetotal) AS "Soma" (Quando a coluna não tiver nome, colocar um apelido desta forma AS "nomeApelido")
//	FROM Sales.SalesOrderDetail
//	
//	SELECT TOP 10 MIN(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna o menor valor cadastrado)
//	
//	SELECT TOP 10 MAX(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna o valor máximo cadastrado)
//	
//	SELECT TOP 10 AVG(lineTotal)
//	FROM Sales.SalesOrderDetail (Retorna a média)
//	
//	*********************************************************************************
//					==GROUP BY== 
//	(Basicamente divide o resultado da sua pesquisa em grupos, para cada grupo que vc aplicar
//	uma função de agregação, por exemplo: calcular a soma de itens, contar o números de itens naquele grupo)
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
//	GROUP BY color;   (média de preços por cor)
//	
//	SELECT color, AVG(LISTPRICE) AS "PRECO"
//	FROM Production.Product
//	WHERE Color = 'Silver'
//	GROUP BY color;   (média de preços por cor silver)
//	
//	*********************************************************************************
//					==HAVING== 
//	(Basicamente muito usado em junção do group by, para filtrar resultados de um agrupamento.
//	De uma forma mais simples, ele é basicamente um where para dados agrupados.
//	a grande diferença entre having e where, é que o group by é aplicado depois que os dados já foram agrupados,
//	enquanto o where é aplicado antes dos dados serem agrupados)
//	
//	EX: Vamos dizer que queremos saber quais nomes no sistema tem ocorrencia maior que 10 vezes
//	SELECT FirstName, COUNT(FirstName) AS "Qtd"
//	FROM Person.Person
//	GROUP BY FirstName
//	Having COUNT(FirstName) > 10 (Só consigo usar o having após o group by
//	
//	Por exemplo queremos saber quais produtos que no total de vendas entre 126k  e 500k
	
//	*********************************************************************************
//					==AS== 
//	serve para renomear as colunas
//	SELECT TOP 10 ListPrice as "Preço" (caso apenas uma palavra ,não precisa aspas)
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
//	da TabelaA e TabelaB quando são iguais. E além disso se não houver valores
//	correspondentes, ele simplismente irá preencher esses lado com null
//	_________________________
//	|  	A			B		|
//	| id Nome	 id Nome	|
//	|1 robo		1 Espada	|
//	|2 Macaco	2 Robo		|
//	|3 Samurai	3 Mario		|
//	|4 Monitor	4 Samurai	|
//	|_______________________|
//	SELECT *
//	FROM TabeçaA	
//	FULL OUTER JOIN Tabela B
//	ON TabelaA.nome = TabelaB.nome
//
//	== LEFT OUTER JOIN
//	Left outer Join retorna um conjunto de todos os registros
//	da tabelaA, e alem disso, os registros correspondentes(quando
//	disponiveis) na TabelaB. Se não houver registros correspondentes
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
//	-- quero descobrir quais pessoas tem um cartão de crédito registrado
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
//	Ele vai remover os dados duplicados e vai juntar as informações da tabela
//
//	*********************************************************************************
//	==DATEPART== 
//	SELECT SalesOrderID, DATEPART(month,OrderDate) as "Mes"
//	FROM Sales.SalesOrderHeader
//
//	*********************************************************************************
//	==MANIPULAÇÂO STRING==  
//
//  concatenação	
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
//	==OPERAÇÔES MATEMÀTICAS==  
//	
// 	SELECT UnitPrice + LineTotal
//	FROM Sales.SalesOrderDetail		//soma
//	
//	SELECT UnitPrice - LineTotal
//	FROM Sales.SalesOrderDetail		//subtração
//	
//	SELECT UnitPrice * LineTotal
//	FROM Sales.SalesOrderDetail  //multiplicação
//
//	SELECT AVG(LineTotal)
//	FROM Sales.SalesOrderDetail  //média
//	
//	SELECT MIN(LineTotal)
//	FROM Sales.SalesOrderDetail  //valor mínimo e o MAX para valor máximo
//	
//	SELECT ROUND(LineTotal,2)
//	FROM Sales.SalesOrderDetail  //arredondamento, casa décimal
//	
//	*********************************************************************************
//	==SUBQUERY OU SUBSELECT==  (De forma geral é um select dentro de outro select)
//
//	--Monte um relatório para min de todos os produtos cadastrado que tem o preço acima da média
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
//	--Eu quero todos os clientes que moram na mesma região
//	SELECT A.ContactName, B.ContactName
//	FROM CUSTOMERS A, CUSTOMERS B
//	WHERE A.Region = B.Region
//	
//	*********************************************************************************
//	==TIPOS DE DADOS==
//	1 booleanos
//	2 cacactere
//	3 números
//	4 temporais
//	
//	#Booleanos BIT (Por padrão ele é inicializado como numero, e pode receber tanto 1 quanto 0 ou null
//	
//	#Caracteres CHAR (Permite inserie até uma quandidade fixa de caracteres e sempre ocupa todo o espaço reservado 10/50)
//	Tamanho variáveis - varchar ou nvarchar, permite inserir até uma quantidade que for definida, porem só usa o espaço 
//	que for preenchido 10/50
//	
//	#Numeros 
//	TINYINT - não tem parte valor fracionados (ex: 1.43 etc) 
//	SMALLINT - mesma coisa porem limite maior
//	INT - mesma coisa limite maior
//	BIGINT - mesma coisa limite maior
//	NUMERIC OU DECIMAL - valores exatos, porem permite ter parte fracionados, que tambem pode ser especificado a prescisão
//  escala (escala é o número de digitos na parte fracional) -ex: NUMERIC(5,2)
//	
//	#Valores Aproximados
//	Real - tem precisão aproximada de até 15 digitos
//	Float - mesmo conteiro do real
//	
//	#Temporais
//	DATE - armazena data no formato aaaa/mm/dd
//	DATETIME - armazena data e horas no formato  aaaa/mm/dd:hh:mm:ss	
//	DATETIME2 - data e horas com adição de milissegundos no formato aaaa/mm/dd:hh:mm:ssssss
//	SMALLDATETIME - data e hora nos respeitando o limite entre '1900-01-01:00:00:00' até '2079-06-06:23:59:59'
//	TIME - horas, minutos, segundos e milissegundos respeitando o limite de '00:00:00:00000000' to '23-59-59-999'
//	DATETIMEOFSET - permite armazenar informações de data e horas incluindo o fuso horário
//	
//	*********************************************************************************
//	==CHAVE PRIMARIA E ESTRANGEIRA==
	
//	== CHAVE PRIMÁRIA 
//	é basicamente uma coluna ou grupo de colunas, usada para identificar unicamente uma linha de tabela
//	você consegue criar essas chaves primárias através de restrições (ou contraints em inglês)
//	que são regras que você define quando está criando uma coluna
//	assim quando você faz isso você está criando um índice único para aquela coluna ou grupo de colunas
//	
//	== CHAVE ESTRANGEIRA
//	uma chave estrangeira é uma coluna ou grupo de colunas em uma tabela que identifica unicamente uma linha em outra tabela
//	ou seja, uma chave estrangeira é definida em uma tabela onde ela é apenas uma referência e não contém todos os dados ali
//	então uma chave estrangeira é simplismente uma coluna ou grupo  de colunas que é uma chave primária em outra tabela
//	no SQL Server você define uma chave estrangeira através de um "Foreign Key constraint" ou restrição de chave estrangeira
//	uma restrição de chave estrangeira indica que os valores em uma coluna ou grupo de colunas na tabela filho correspondem aos valores
//	na tabela pai
//	nos podemos entender que uma chave estrangeira mantem a "integridade referencial"
//	
//	*********************************************************************************
//	==CREATE TABLE==
//	Principais tipos de restrições que podem ser aplicadas:	
//	NOT NULL -  não permite nulos
//	UNIQUE - força que todos os valores em uma coluna sejam diferentes
//	PRIMARY KEY - uma junção de NOT NULL e UNIQUE
//	FOREIGN KEY - identifica únicamente uma linha em outra tabela
//	CHECK - Força uma condição específica em uma coluna
//	DEFAULT - Força um valor padrão quando nenhum valor é passado
//	
//	CREATE TABLE Canal(
//	CanalID INT PRIMARY KEY,
//	Nome varchar(150) NOT NULL,
//	ContagemIncritos INT DEFAULT 0,
//	DataCriacao DATETIME NOT NULL
//	);
//
//	SELECT *
//	FROM Canal	
//	
//	*********************************************************************************
//	==INSERT INTO==
//	
//	INSERT INTO PRODUTOS 
//	VALUES(1,'IPHONE 11', GETDATE(), 'EAN1232547', 0); //uma maneira
//	
//	INSERT INTO PRODUTOS
//	(CODIGO, DESCRICAO, EAN)
//	VALUES(2,'NOTEBOOK SANSUNG', 'EAN8591457'); //inserindo em apenas algumas colunas
//	
//	SELECT * 
//	FROM PRODUTOS
//	WHERE CODIGO = 2 //consultei apenas o numero dois
//	
//	INSERT INTO aula(id,nome)     
//	VALUES (1, 'aula01')    //inserindo um valor
//
//	SELECT *
//	FROM aula
//	
//	INSERT INTO aula(id,nome)
//	VALUES 					
//	(2, 'Aula2'),
//	(3, 'Aula3'),
//	(4, 'Aula4');		//inserindo vários valores	
//
//	SELECT * 
//	FROM aula
//	
//	SELECT * 
//	INTO tabelaNova FROM aula
//
//	SELECT  * FROM tabelaNova   //copiar tudo de uma tabela existente
//		
//	*********************************************************************************
//	==UPDATE==
//	
//	UPDATE aula
//	SET nome = 'mudei'
//	WHERE id = 3   //lembrar sempre do WHERE, caso contrário ele altera tudo
//
//	*********************************************************************************
//	==DELETE==
//	
//	DELETE FROM aula
//	WHERE nome = 'mell'  //lembrar sempre do WHERE, caso contrário ele vai apagar tudo
//	
//	*********************************************************************************
//	==ALTER TABLE== (altera a estrutura de uma tabela)
//	é possível ser várias coisas com o alter table:	
//	add, remover, ou alterar uma coluna
//	set valores padrões para uma coluna
//	add ou remover restrições de colunas
//	renomear uma tabela
//	
//	ALTER TABLE YouTube
//	ADD ativo bit    //adicionando uma nova coluna
//	
//	ALTER TABLE YouTube
//	ALTER COLUMN categoria VARCHAR(300) NOT NULL	//alterar a capacidade de qtd de caracteres
//	
//	EXEC sp_RENAME 'YouTube.nome', 'nomeCanal', 'COLUMN'  //altera o nome da coluna
//	
//	EXEC sp_RENAME 'YouTube', 'YouTubeAtualizado' 	//altera o nome da Tabela	
//	
//	*********************************************************************************
//	==DROP TABLE== (Exclui uma tabela do banco de dados)
//	
//	DROP TABLE ErrorLog // apaga a tabela ErrorLog
//		
//	TRUNCATE TABLE Person.password //apaga apenas os registros
//
//	SELECT *
//	FROM Person.Password  //
//	
//	*********************************************************************************
//	==CHECK CONSTRAINT==  (Insere restrição em valores)
//		
//	CREATE TABLE CarteiraMotorista (
//	id INT NOT NULL,
//	Nome VARCHAR(255) NOT NULL,
//	Idade INT CHECK (idade >= 18) //CHECK CONSTRAINT
//	);
//
//	SELECT * FROM CarteiraMotorista
//
//	INSERT INTO CarteiraMotorista (id,nome, idade)
//	VALUES (1,'Valdano', 17)  //neste caso dará um erro, pois tem que ser maior ou igual 18
//	
//	*********************************************************************************
//	==NOT NULL CONSTRAINT== (força com que  seja possível insetir dados em uma tabela sem preencher a coluna marcada como NOT NULL)
//		
//	CREATE TABLE CarteiraMotorista (
//	id INT NOT NULL,
//	Nome VARCHAR(255) NOT NULL,
//	Idade INT CHECK (idade >= 18) //CHECK CONSTRAINT
//	);
//	
//	*********************************************************************************
//	==UNIQUE CONSTRAINT== ( colunas únicas, porém diferente de um primary key, pode existir várias colunas com a restrição UNIQUE)
//		
//	CREATE TABLE CarteiraMotorista (
//	id INT NOT NULL,
//	Nome VARCHAR(255) NOT NULL,
//	Idade INT CHECK (idade >= 18),
//	CodigoCNH INT NOT NULL UNIQUE
//	);
//	
//	*********************************************************************************
//	==VIEWS== (São tabelas criadas para consulta onde vc usa outras tabelas como base para criar uma nova tabela
//	de pesquisa com apenas dados específicos que você precisa de uma tabela)
//		
//	CREATE VIEW [Pessoas Simplificadas] AS
//	SELECT FirstName, MiddleName, LastName
//	FROM Person.Person
//	WHERE Title = 'MS.'
//
//	SELECT * 
//	FROM [Pessoas Simplificadas]
//	
//	
//	 	
	
	
	
}
