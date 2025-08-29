
-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS bdappyummy;
USE bdappyummy;

-- Tabla Rol
CREATE TABLE rol (
    id_rol INT PRIMARY KEY AUTO_INCREMENT,
    nombrerol VARCHAR(20),
    estado INT,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);

-- Tabla Usuario
CREATE TABLE Usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255),
    Correo VARCHAR(255) UNIQUE,
    Pass VARCHAR(255),
    estado INT,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    Rol VARCHAR(255) -- Agrega la columna 'Rol'
);


-- Tabla Rol_Usuario
CREATE TABLE rol_usuario (
    id_rol_usuario INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    id_rol INT,
    estado INT,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id_usuario),
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
);

-- Tabla Categoria_origen
CREATE TABLE Categoria_origen (
    id_cat_or INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_cat_or VARCHAR(255) NOT NULL,
    estado INT,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255)
);

-- Tabla Categoria_comida
CREATE TABLE Categoria_comida (
    id_cat_com INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_cat_com VARCHAR(255) NOT NULL,
    estado INT,
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
    estado INT,
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
    estado INT,
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
    estado INT,
    fecha_creacion DATETIME,
    fecha_actualizacion DATETIME,
    usuario_creacion VARCHAR(255),
    usuario_actualizacion VARCHAR(255),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto),
    FOREIGN KEY (id_venta) REFERENCES Venta(id_venta)
);

-- Inserta los usuarios con la columna Rol
INSERT INTO Usuario (Nombre, Apellido, Correo, Pass, Rol, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion) VALUES
('Juan', 'Pérez', 'juan.perez@example.com', 'password123', 'Vendedor', 1, NOW(), NOW(), 'sistema', 'admin'),
('Ana', 'García', 'ana.garcia@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'sistema', 'admin'),
('Pedro', 'Rodríguez', 'pedro.rodriguez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'sistema', 'admin');

-- Y los otros 50 usuarios que agregaste
INSERT INTO usuario (Nombre, Apellido, Correo, Pass, Rol, estado, fecha_creacion, fecha_actualizacion, usuario_creacion, usuario_actualizacion)
VALUES
    ('Maria', 'Gomez', 'maria.gomez@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Carlos', 'López', 'carlos.lopez@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Laura', 'Martínez', 'laura.martinez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('David', 'Pérez', 'david.perez@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Ana', 'Sánchez', 'ana.sanchez@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Javier', 'Fernández', 'javier.fernandez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Isabel', 'Ramírez', 'isabel.ramirez@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Sergio', 'Díaz', 'sergio.diaz@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Carmen', 'Vargas', 'carmen.vargas@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Andrés', 'Morales', 'andres.morales@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Elena', 'Ruiz', 'elena.ruiz@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Pablo', 'Jiménez', 'pablo.jimenez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Sofía', 'Castro', 'sofia.castro@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Miguel', 'Ortega', 'miguel.ortega@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Lucia', 'Silva', 'lucia.silva@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Daniel', 'Torres', 'daniel.torres@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Silvia', 'Herrera', 'silvia.herrera@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Mario', 'Rojas', 'mario.rojas@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Lorena', 'Iglesias', 'lorena.iglesias@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Jorge', 'Santos', 'jorge.santos@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Natalia', 'Paz', 'natalia.paz@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Héctor', 'Blanco', 'hector.blanco@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Irene', 'Romero', 'irene.romero@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Oscar', 'Medina', 'oscar.medina@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Marina', 'Soto', 'marina.soto@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Raúl', 'Gil', 'raul.gil@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Eva', 'Cruz', 'eva.cruz@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('José', 'Reyes', 'jose.reyes@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Angela', 'Guerra', 'angela.guerra@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Ricardo', 'Luna', 'ricardo.luna@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Monica', 'Torres', 'monica.torres@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Felipe', 'Morales', 'felipe.morales@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Beatriz', 'Ruiz', 'beatriz.ruiz@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Diego', 'Sánchez', 'diego.sanchez@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Nuria', 'Gómez', 'nuria.gomez@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Adrián', 'López', 'adrian.lopez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Verónica', 'Martínez', 'veronica.martinez@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Esteban', 'Pérez', 'esteban.perez@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Paola', 'Ramírez', 'paola.ramirez@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Gonzalo', 'Díaz', 'gonzalo.diaz@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Andrea', 'Vargas', 'andrea.vargas@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Fernando', 'Morales', 'fernando.morales@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Teresa', 'Ruiz', 'teresa.ruiz@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Manuel', 'Jiménez', 'manuel.jimenez@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Clara', 'Castro', 'clara.castro@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Samuel', 'Ortega', 'samuel.ortega@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Cristina', 'Silva', 'cristina.silva@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Arturo', 'Torres', 'arturo.torres@example.com', 'pass789', 'Asistente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Natalia', 'Herrera', 'natalia.herrera@example.com', 'pass123', 'Vendedor', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Gabriel', 'Rojas', 'gabriel.rojas@example.com', 'pass456', 'Gerente', 1, NOW(), NOW(), 'admin', 'admin'),
    ('Juan','Betos','juan@email.com','$2a$12$e4oeuHI8nKjUCQCJmqbEEOcT5drDTG2wJWbtKjkPTdNERnqPHN61K','Gerente',1, NOW(), NOW(), 'admin', 'admin');