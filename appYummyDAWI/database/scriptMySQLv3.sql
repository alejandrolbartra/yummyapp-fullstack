-- Crear la base de datos
CREATE DATABASE bdAppYummy;
USE bdAppYummy;

-- Tabla Usuario
create table rol (
	id_rol int primary key auto_increment,
    nombrerol varchar(20),
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);


CREATE TABLE Usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255),
	Correo VARCHAR(255) UNIQUE,
    Pass VARCHAR(255),
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);

create table rol_usuario (
	id_rol_usuario int primary key auto_increment,
    id_usuario int,
    id_rol int,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
);

-- Tabla Categoria_origen
CREATE TABLE Categoria_origen (
    id_cat_or INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_cat_or VARCHAR(255) NOT NULL,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);

-- Tabla Categoria_comida
CREATE TABLE Categoria_comida (
    id_cat_com INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_cat_com VARCHAR(255) NOT NULL,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);

-- Tabla Producto
CREATE TABLE Producto (
    id_producto INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Precio DECIMAL(10, 2) NOT NULL,
    Stock INT NOT NULL,
    id_cat_or INT,
    id_cat_com INT,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_cat_or) REFERENCES Categoria_origen(id_cat_or),
    FOREIGN KEY (id_cat_com) REFERENCES Categoria_comida(id_cat_com)
);

-- Tabla Venta
CREATE TABLE Venta (
    id_venta INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    Fecha DATETIME NOT NULL,
    Total DECIMAL(10, 2) NOT NULL,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario)
);

-- Tabla Detalle_Venta
CREATE TABLE Detalle_Venta (
    id_det_ven INT PRIMARY KEY AUTO_INCREMENT,
    id_producto INT NOT NULL,
    id_venta INT NOT NULL,
    Cantidad INT NOT NULL,
    Subtotal DECIMAL(10, 2) NOT NULL,
    estado int,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto),
    FOREIGN KEY (id_venta) REFERENCES Venta(id_venta)
);





-- Adicionando registros a la base de datos

-- Usuario
INSERT INTO Usuario (Nombre, Apellido, Correo, Pass, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Juan', 'Pérez', 'juan.perez@example.com', 'password123', 1, '2025-01-01 08:00:00', '2025-08-01 10:00:00', 'sistema', 'admin'),
('Ana', 'García', 'ana.garcia@example.com', 'pass456', 1, '2025-01-02 08:00:00', '2025-08-02 10:00:00', 'sistema', 'admin'),
('Pedro', 'Rodríguez', 'pedro.rodriguez@example.com', 'pass789', 1, '2025-01-03 08:00:00', '2025-08-03 10:00:00', 'sistema', 'admin');

INSERT INTO rol (nombrerol, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Administrador', 1, '2025-01-01 09:00:00', '2025-08-01 11:00:00', 'sistema', 'admin'),
('Vendedor', 1, '2025-01-02 09:00:00', '2025-08-02 11:00:00', 'sistema', 'admin'),
('Cliente', 1, '2025-01-03 09:00:00', '2025-08-03 11:00:00', 'sistema', 'admin');

INSERT INTO rol_usuario (id_usuario, id_rol, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
(1, 1, 1, '2025-01-01 12:00:00', '2025-08-01 12:30:00', 'sistema', 'admin'),
(2, 2, 1, '2025-01-02 12:00:00', '2025-08-02 12:30:00', 'sistema', 'admin'),
(3, 3, 1, '2025-01-03 12:00:00', '2025-08-03 12:30:00', 'sistema', 'admin');

INSERT INTO Categoria_origen (Nombre_cat_or, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Nacional', 1, '2025-01-01 13:00:00', '2025-08-01 14:00:00', 'sistema', 'admin'),
('Importado', 1, '2025-01-02 13:00:00', '2025-08-02 14:00:00', 'sistema', 'admin');

INSERT INTO Categoria_comida (Nombre_cat_com, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Carnes', 1, '2025-01-01 14:00:00', '2025-08-01 15:00:00', 'sistema', 'admin'),
('Verduras', 1, '2025-01-02 14:00:00', '2025-08-02 15:00:00', 'sistema', 'admin');

INSERT INTO Producto (Nombre, Precio, Stock, id_cat_or, id_cat_com, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Carne de Res', 15.00, 100, 1, 1, 1, '2025-01-01 15:00:00', '2025-08-01 16:00:00', 'sistema', 'admin'),
('Lechuga', 2.50, 200, 2, 2, 1, '2025-01-02 15:00:00', '2025-08-02 16:00:00', 'sistema', 'admin');

INSERT INTO Venta (id_usuario, Fecha, Total, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
(1, '2025-08-20 10:00:00', 30.00, 1, '2025-08-20 10:00:00', '2025-08-20 10:00:00', 'sistema', 'admin'),
(2, '2025-08-21 11:00:00', 45.00, 1, '2025-08-21 11:00:00', '2025-08-21 11:00:00', 'sistema', 'admin');

INSERT INTO Detalle_Venta (id_producto, id_venta, Cantidad, Subtotal, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
(1, 1, 2, 30.00, 1, '2025-08-20 10:15:00', '2025-08-20 10:15:00', 'sistema', 'admin'),
(2, 2, 3, 7.50, 1, '2025-08-21 11:15:00', '2025-08-21 11:15:00', 'sistema', 'admin');


use bd_utilHome;