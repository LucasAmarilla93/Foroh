# **APIREST_FOROHUB** - Foro Digital de Discusión

**Características principales**:
- **Autenticación segura** mediante JWT.
- **Gestión completa de usuarios**, donde puedes registrar, editar y eliminar usuarios.
- **Creación y gestión de tópicos** para discusiones en el foro.
- **API RESTful** totalmente operativa.
- **Base de datos MySQL** para el almacenamiento de datos.

## **Tecnologías Utilizadas**

- **Java 17** – El corazón del backend.
- **Spring Boot 2.x** – Framework para simplificar el desarrollo de aplicaciones web.
- **Spring Security** – Autenticación y autorización robusta.
- **JWT (JSON Web Tokens)** – Autenticación segura para los usuarios.
- **JPA (Java Persistence API)** – Para manejar la base de datos de manera eficiente.
- **MySQL** – Sistema de base de datos relacional.
- **Lombok** – Reducción de boilerplate code.

##  **Instalación y Configuración**

Para comenzar a utilizar **APIREST_FOROHUB**, sigue estos pasos:

### 1. **Clona el repositorio**

Primero, debes clonar el proyecto a tu máquina local:

```bash
git clone https://github.com/Marcelo/APIREST_FOROHUB.git
2. Configura la base de datos
Este proyecto usa MySQL para almacenar los datos del foro. Asegúrate de tener MySQL instalado y corriendo en tu máquina.

Crea una base de datos llamada forohub_db.
Modifica el archivo src/main/resources/application.properties con tus credenciales de MySQL.
properties
Copiar código
spring.datasource.url=jdbc:mysql://localhost:3306/forohub_db
spring.datasource.username=root
spring.datasource.password=tu_password
api.security.secret=tu_clave_secreta
3. Ejecuta el proyecto
Ahora puedes ejecutar el proyecto usando Maven o tu IDE favorito:

Si usas Maven, ejecuta el siguiente comando:
bash
Copiar código
./mvnw spring-boot:run
O si usas tu IDE, simplemente ejecuta la clase ForoHubApplication.java.
Endpoints de la API
La API cuenta con varios endpoints esenciales para interactuar con el foro. Aquí están los detalles de los endpoints:

Autenticación

POST /api/auth/login – Inicia sesión y devuelve un token JWT.

Usuarios
GET /api/users – Obtiene todos los usuarios registrados.
POST /api/users – Registra un nuevo usuario.
GET /api/users/{id} – Obtiene información de un usuario específico.
PUT /api/users/{id} – Actualiza un usuario.
DELETE /api/users/{id} – Elimina un usuario.

Tópicos
GET /api/topics – Obtiene todos los tópicos de discusión.
POST /api/topics – Crea un nuevo tópico de discusión.
GET /api/topics/{id} – Obtiene un tópico por ID.
PUT /api/topics/{id} – Actualiza un tópico.
DELETE /api/topics/{id} – Elimina un tópico.
