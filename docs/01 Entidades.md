# Entidades
<hr />
Definiremos las entidades como sigue:

#### Post

* id
* title: text
* content: text
* author: text
* votes: integer
* createdAt: date
* updatedAt: date

#### Comment

* id
* comment: text
* author: text
* post_id: text
* votes: integer
* createdAt: date
* updatedAt: date

#### User

* id
* username: text
* email: text
* password: text

#### Role

* id
* name: text
* description: text
