CREATE DATABASE transporte3ev;
USE transporte3ev;

CREATE TABLE conductores(
id INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(100),
nombre VARCHAR(100),
carnet VARCHAR(100)
);

CREATE TABLE carretilleros(
id INT AUTO_INCREMENT PRIMARY KEY,
dni VARCHAR(100),
nombre VARCHAR(100),
costeHora double
);

INSERT INTO conductores (dni, nombre,carnet)
VALUES ("000001","Pepe","C1"),("000002","Manuel","C2");

INSERT INTO carretilleros (dni, nombre, costeHora)
VALUES ("000003","Andres",22),("000004","Felipe",25);


