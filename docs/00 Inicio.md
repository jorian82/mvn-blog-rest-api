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

### Qué necesitamos?
Primero que nada, es necesario definir como vamos a dividir la aplicación, recientemente tomé un curso de spring boot,
en él se propone una estructura de varias capas, repositorios, servicios y controladores, en la capa de repositorio 
tendremos las clases entidad y las clases repositorio, en la capa de servicios tendremos las interfaces de servicio y 
las implementaciones de las interfaces y en la capa de controladores tendremos las clases que nos van a indicar las 
rutas con las cuales vamos a identificar los endpoints de nuestra API.

Ahora, vamos a crear una clase para cada entidad definiendo las propiedades/columnas y agregando los apropiados setters y 
getters, ésta entidad se utiliza para crear una clase repositorio que extiende a una de las clases repositorio de la 
librería que estemos utilizando (CrudRepository, JPARepository, etc) en éste caso en particular que utilizamos mongodb
estamos utilizando la librería Panache para obtener información de la DB. 

Ya que tenemos ésta capa, pasamos a la capa que nos va a ayudar a comunicar las rutas de las APIs con la DB, la capa de 
servicios, vamos a definir una interfaz por cada table para indicar los metodos que nuestros servicios deben tener para 
interactuar con los controladores

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
<hr />

## Detalles de Modelos

## Detalles de Repositorios

## Detalles de Servicios

## Detalles de Responses

## Detalles de Mappers

## Detalles de Recursos/Controladorers