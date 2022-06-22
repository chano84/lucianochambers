# Grupo de Whathsapp XCALE

Start App:
```
mvn clean install
java src/main/java/com/core/Application.java o RUN de Application.java desde el IDE Application.java

```

Visualizacion de Base de Datos: </br>
```
URL: http://localhost:8080/h2 </br>
Ingresar en el campo JDBC URL: jdbc:h2:mem:testdb
```

Api Rest para simular envío de mensajes: </br>
```
curl --location --request POST 'localhost:8080/message' \
--header 'Content-Type: application/json' \
--data-raw '
{
"id" : 1,
"from": {
"id": 1,
"name": "Juan perez"
},    
"to": {
"id": 4,
"name": "Grupo de Amigos",
"contacts": [{
"id": 2,
"name": "Pedro Perez"
},{
"id": 3,
"name": "Manuel Perez"
}
]
},
"content": "Hola amigos"
}'
```

Notificaciones guardadas en tabla Notifications:
```
SELECT * FROM NOTIFICATIONS;
```
