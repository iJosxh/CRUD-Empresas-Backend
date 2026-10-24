-- Script de creación de la tabla empresas
-- Motor: PostgreSQL
-- Ejecuta este archivo en la base de datos de tu proyecto.

CREATE TABLE IF NOT EXISTS empresas (
    id_empresa INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre_comercial VARCHAR(150),
    razon_social VARCHAR(150),
    telefono VARCHAR(20),
    correo_electronico VARCHAR(150),
    nit VARCHAR(30),
    estado VARCHAR(20),
    direccion VARCHAR(250),
    CONSTRAINT unique_empresa UNIQUE (razon_social)
);
