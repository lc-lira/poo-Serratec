CREATE TABLE conta(numero_conta SERIAL PRIMARY KEY, titular VARCHAR (60) NOT NULL, saldo DECIMAL);
INSERT INTO conta(titular, saldo) VALUES('lucas', 2000.00);
SELECT * FROM conta;