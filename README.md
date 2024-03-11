# Servicio REST uno devuelve un saludo y el otro el factorial de un numero 

Este proyecto es un servicio REST en Spring Boot que devuelve un saludo y otro servicio REST que devuelve el factorial de un numero 

## Comenzando

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

### Prerrequisitos

Necesitas tener instalado Java JDK 1.17 y Gradle.

### Instalación

1. Clona el repositorio a tu máquina local:

git clone [https://github.com/mlopez8621/pruebaTecnicaSpringBoot.git](https://github.com/mlopez8621/pruebaTecnicaSpringBoot.git)

2. Navega al directorio del proyecto:

cd pruebaTecnicaSpringBoot

3. Construye el proyecto con Maven:

./gradlew build


4. Ejecuta la aplicación:

./gradlew bootRun
http://localhost:8090/nttdata/api/hola
http://localhost:8090/nttdata/api/factorial/5

## Uso

Para solicitar el saludo, realiza una petición GET a `nttdata/api/hola`:

GET nttdata/api/hola

Para solicitar el factorial de un numero, realiza una petición GET a `nttdata/api/factorial/{numero}`:

GET /nttdata/api/factorial/5

Para acceder a la documentación de la API generada por OpenAPI, visita:

http://localhost:8090/nttdata/swagger-ui/index.html
https://arcane-lowlands-60094-aa188aa11f27.herokuapp.com/nttdata/swagger-ui/index.html


## Pruebas

Para ejecutar las pruebas unitarias del proyecto:

./gradlew test --tests *FactorialServiceTest

## Despliegue

Para desplegar este proyecto en un servidor Tomcat, sigue estos pasos:

1. Copia el archivo `.war` generado en el directorio `target` al directorio `webapps` de tu servidor Tomcat.

2. Inicia el servidor Tomcat.

3. Accede a la aplicación a través de `http://localhost:8090/pruebaTecnica`.

## Construido con

* [Spring Boot](https://spring.io/projects/spring-boot) - El framework web usado
* [Gradle](https://gradle.org/) - Manejador de dependencias

## Autores

- **Michel Leonardo López Avendaño** - [mlopez8621](https://github.com/mlopez8621)

## Agradecimientos

- Agradecimiento a toda mi familia por su apoyo.
