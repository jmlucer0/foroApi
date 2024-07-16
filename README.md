# ForoHub: API REST para manejo de tópicos en un foro

## Descripcion
ForoHub es una API RESTful desarrollada en Java con Spring Boot, Spring Security, Flyway Migrations y MySQL que permite gestionar tópicos en un foro. La autenticación se realiza mediante tokens JWT.

### Tecnologías utilizadas
* Java
* Spring Boot
* Spring Security
* Flyway Migrations
* MySQL
* JWT

### Configuración del entorno

Modifica las variables de entorno con los datos de conexión a la base de datos y las claves secretas para la generación de tokens JWT en el archivo 'application.properties'.

### Autenticación

Para acceder a los endpoints de la API, primero debes obtener un token JWT mediante el endpoint '/login'. Envía una solicitud POST con los siguientes datos en el cuerpo de la petición:
JSON
{
"username": "usuario",
"password": "contraseña"
}
## Uso de los endpoints

La API proporciona los siguientes endpoints:

GET /tópicos: Obtiene una lista de todos los tópicos.
GET /tópicos/{id}: Obtiene un tópico específico por su ID.
POST /tópicos: Crea un nuevo tópico.
PUT /tópicos/{id}: Actualiza un tópico existente.
DELETE /tópicos/{id}: Elimina un tópico.