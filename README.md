# CRUD Empresas - Backend

API REST para la gestión de empresas mediante operaciones CRUD (crear, consultar, actualizar y eliminar).

## Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- PostgreSQL

## Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java JDK 17
- PostgreSQL.
- Git.

## Instalación

1. Clonar el repositorio:

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```

2. Entrar en la carpeta del backend:

   ```bash
   cd backend
   ```

## Configuración de PostgreSQL

1. Crear una base de datos llamada:

   ```sql
   CREATE DATABASE empresas_pentcloud;
   ```
Tambien puede ejecutar el .sql que se encuentra en los archivos


3. Verificar que la configuración de conexión en `src/main/resources/application.properties` coincida con los datos de PostgreSQL.

   La configuración debe contemplar:

   - Servidor: `localhost`
   - Puerto: `5432`
   - Base de datos: `empresas_pentcloud`
   - Usuario: el usuario configurado en PostgreSQL
   - Contraseña: contraseña configurada

## Ejecución

Desde la raíz del proyecto, ejecutar en PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

La API estará disponible en:

```text
http://localhost:8080
```

## Endpoints principales

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/empresas` | Listar empresas |
| GET | `/api/empresas/{id}` | Consultar una empresa por ID |
| POST | `/api/empresas` | Registrar una empresa |
| PUT | `/api/empresas/{id}` | Actualizar una empresa |
| DELETE | `/api/empresas/{id}` | Eliminar una empresa |

## Compilación

Para compilar el proyecto y comprobar que no haya errores de compilación:

```powershell
.\mvnw.cmd compile
```