# Overview
<hr />

Se planea hacer una API para un blog, ésta permitirá a una aplicación front-end (Angular, React, Vue) gestionar posts,
comentarios, usuarios y sus roles, adicionalmente se implementará una capa de seguridad con jwt para restringir el
acceso/uso de rutas en la API, las cuales se definirán más adelante.

Éste proyecto tiene la finalidad de ser una guía para la codificación con Quarkus y estudiar las diferencias/similitudes 
que hay entre éste y Spring Boot así como también ganar experiencia con bases de datos no relacionales como MongoDB.

Se tiene contemplado en una iteración posterior agregar el uso de bases de datos relacionales para darle flexibilidad a
la API y estudiar como crece la complejidad de un proyecto a medida que se van a gregando nuevas funcionalidades.

La estructura principal de la aplicación estará basada en el patron singleton usando principios de programación SOLID.

Ésta documentación tiene la finalidad de hacer un compendio de la experiencia de desarrollo así como el proceso, para 
crear un documento PDF más formal que sirva como guía/referencia para mi y otros desarrolladores

### Estructura de la aplicación

Definiremos nuestra estructura de la siguiente forma:

* Un paquete de entidades: Post, Comment, User, Role y Token
* Un paquete de repositorios, uno para cada entidad, para la interacción de los servicios con las entidades
* Un paquete de modelos, uno por cada entidad, los cuales serán el puente entre las entidades y los controladores/recursos
* Un paquete de servicios, uno por cada repositorio, para servir como medio de comunicación entre los repositorios y los controladores
* Un paquete de responses, uno para cada entidad, que serán la estructura de respuesta de nuestros controladores
* Un paquete de mappers, que nos servirán para conversión entre modelos y entidades y viceversa
* Un paquete de recursos/controladores, uno por cada entidad/modelo que nos servirá para definir las rutas en las que llamaremos a los diferentes servicios

## Detalles de Entidades

## Detalles de Modelos

## Detalles de Repositorios

## Detalles de Servicios

## Detalles de Responses

## Detalles de Mappers

## Detalles de Recursos/Controladorers