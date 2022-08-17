Alumnos-backend-apirest

Prerrequisitos para correr el proyecto: Tener una base de datos Postgres instalada en el puerto 5432

Para correr el proyecto basta con descargarlo e importarlo en un IDE como un 'Existing Maven Projects' enseguida comenzará a descargar las dependencias de MAVEN y una vez finalizado este proceso estará listo para correrse como 'Spring Boot App'

Al iniciar, la aplicación escaneará las clases de entidad y creará las tablas en la BD automáticamente
Después se importarán los registros en la tabla 'alumnos' con el archivo '\src\main\resources\import.sql' Entonces la aplicación estará lista para realizar pruebas

El servicio estará corriendo en: 'http://localhost:8080/'
