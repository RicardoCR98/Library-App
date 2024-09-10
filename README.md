# Sistema de Biblioteca - Aplicación de Escritorio

## Descripción

El **Sistema de Biblioteca** es una aplicación de escritorio para Windows desarrollada en **Java** que permite gestionar el inventario de una biblioteca mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para libros, autores, usuarios, y préstamos. Esta aplicación facilita el control de los recursos disponibles en una biblioteca y optimiza el proceso de préstamos y devoluciones.

La aplicación utiliza **Java Forms** para la interfaz gráfica, **SQL Server** como base de datos para almacenar toda la información del sistema y **Maven** para la gestión de dependencias del proyecto.

## Características

- **Gestión de Libros**: Añadir, editar, eliminar y consultar libros en el sistema.
- **Gestión de Usuarios**: Registrar nuevos usuarios, modificar detalles y eliminarlos si es necesario.
- **Préstamos y Devoluciones**: Control de préstamos y devoluciones de libros.
- **Búsqueda Avanzada**: Filtrar libros y usuarios mediante diferentes criterios (título, autor, género, etc.).

## Tecnologías Utilizadas

- **Lenguaje de programación**: Java (JDK 11+)
- **Base de datos**: SQL Server
- **Gestión de dependencias**: Maven
- **Interfaz gráfica**: Java Forms (Swing/AWT)
- **ORM**: JDBC para conectar Java con la base de datos SQL Server

## Requisitos Previos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes:

- **JDK 11 o superior**: [Descargar aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **SQL Server**: [Descargar aquí](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)
- **Maven**: [Descargar aquí](https://maven.apache.org/download.cgi)

## Configuración

### Base de Datos

1. Instala y configura **SQL Server**.
2. Crea una base de datos llamada `BibliotecaDB`.
3. Ejecuta el script SQL (proporcionado en el directorio `sql/`) para crear las tablas necesarias (`libros`, `usuarios`, `prestamos`, etc.).
4. Configura las credenciales de la base de datos en el archivo de propiedades `application.properties`:

```properties
jdbc.url=jdbc:sqlserver://localhost:1433;databaseName=BibliotecaDB
jdbc.username=tu_usuario
jdbc.password=tu_contraseña
```

### Ejecución de la Aplicación

1. Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/sistema-biblioteca.git
```

2. Navega al directorio del proyecto:

```bash
cd sistema-biblioteca
```

3. Usa **Maven** para compilar y ejecutar el proyecto:

```bash
mvn clean install
mvn exec:java
```

4. La aplicación se iniciará y podrás interactuar con la interfaz gráfica para gestionar los libros y usuarios.


## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue antes de hacer un pull request.
