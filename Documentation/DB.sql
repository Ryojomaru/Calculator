DROP DATABASE IF EXISTS Calculator;

CREATE DATABASE Calculator;

USE Calculator;

CREATE TABLE operations(
	id 			int (11) Auto_increment NOT NULL ,
	operation 	Varchar(255) ,
	PRIMARY KEY (id)
)ENGINE=InnoDB;