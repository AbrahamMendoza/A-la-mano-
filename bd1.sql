DROP DATABASE IF EXISTS Proyecto;

CREATE DATABASE Proyecto;

USE Proyecto;

DROP TABLE IF EXISTS producto;

CREATE TABLE producto(
codigo VARCHAR(10) NOT NULL PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
descripcion VARCHAR(50) NOT NULL,
cveCategoria INT NOT NULL,
cantidad INT NOT NULL,
precioCompra DOUBLE NOT NULL,
precioVenta DOUBLE NOT NULL,
cveProveedor INT NOT NULL)
Engine = InnoDB;

DESC producto;

INSERT INTO producto VALUES (1,"coca","refresco",1,100,50.50,75.50,10);
INSERT INTO producto VALUES (2,"papas","comida",2,50,3000,3500,5);


SELECT * FROM Producto;