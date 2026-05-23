Portal de Gestión de Incidentes - InfraTech S.A.
Descripción del Proyecto

Este proyecto corresponde al desarrollo de un portal de gestión de incidentes técnicos internos para la empresa InfraTech S.A.

La aplicación permite registrar, visualizar y gestionar incidentes reportados por los colaboradores de la empresa, facilitando el seguimiento de problemas técnicos, asignación de responsables y visualización de estadísticas del soporte brindado.

El sistema fue desarrollado utilizando Angular para el frontend, una API REST para el backend y base de datos relacional, incorporando Docker para facilitar el despliegue y la portabilidad de la aplicación.

Tecnologías Utilizadas
Frontend
Angular
Angular Material
TypeScript
Chart.js
Backend
Spring Boot
Java
Base de Datos
MySQL
Contenedores
Docker
Docker Compose
Control de Versiones
Git
GitHub
Funcionalidades Implementadas
Registro de incidentes
Visualización de lista de incidentes
Cambio de estado de incidentes
Asignación de responsable técnico
Manejo de prioridades
Filtros por estado, prioridad y fecha
Dashboard con estadísticas visuales
Generación de reportes PDF
Alertas para incidentes sin resolver por más de 48 horas
API REST conectada a base de datos
Arquitectura modular
Estructura del Proyecto

portal-incidentes/

├── frontend/

├── backend/

├── docker-compose.yml

├── README.md

└── .gitignore

Requisitos Previos

Antes de ejecutar el proyecto, instalar:

Node.js
Angular CLI
Java JDK 21
Maven
Docker Desktop
Git
Ejecución Local
Frontend

Ingresar a la carpeta frontend:

cd frontend

Instalar dependencias:

npm install

Ejecutar aplicación Angular:

ng serve

Acceder desde:

http://localhost:4200
Backend

Ingresar a la carpeta backend:

cd backend

Ejecutar servidor Spring Boot:

./mvnw spring-boot:run

API disponible en:

http://localhost:8080
Ejecución con Docker

Desde la carpeta raíz del proyecto ejecutar:

docker-compose up --build

Servicios disponibles:

Frontend: http://localhost:4200
Backend: http://localhost:8080
Base de Datos MySQL: puerto 3306
Control de Versiones

El proyecto utiliza GitFlow básico mediante ramas feature/* para el desarrollo de funcionalidades.

Ejemplos:

feature/frontend
feature/backend
feature/dashboard
feature/docker
