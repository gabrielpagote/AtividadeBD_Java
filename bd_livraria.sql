DROP DATABASE livraria;
CREATE DATABASE livraria;
USE livraria;
CREATE TABLE livro(
id INT AUTO_INCREMENT,
titulo VARCHAR(20) NOT NULL,
autor VARCHAR(50),
editora VARCHAR(20),
codigo CHAR(10) NOT NULL,
numExemplares VARCHAR(50),
isbn CHAR(13),
ano CHAR(4),
genero VARCHAR (15),
numPaginas VARCHAR (5),
status VARCHAR(20),
PRIMARY KEY (id));


INSERT INTO livraria(titulo, autor, editora, codigo, numExemplares,
isbn, ano, genero, numPaginas, status)values('Rei Rato','China Mieville',
'Tarja Editorial','123ABC001','2000000','8561541296','2011','fantasia','400',
'lido');

--Inserir
UPDATE livro SET titulo='Assim falou Zaratustra', autor='Nietzsche',
editora='Martin Claret', codigo='123ABC002', numExemplares='32000000',
isbn='8572328564', ano='1885', genero='filosófico', numPaginas='385',
status='lido' WHERE codigo ='123ABC001');

--Excluir
DELETE FROM livro WHERE codigo= '123ABC001';

--Consultar/Pesquisar
SELECT * FROM livro;

