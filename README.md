# WS Rest Tutorial


Chiamata con post

```
curl -d "name=Quinto" -X POST http://localhost:8080/rest-tutorial/hello
```

Chiamata con get

```
curl http://localhost:8080/rest-tutorial/helloWorld
```

Chiamata con get e parametro nella url

```
curl http://localhost:8080/rest-tutorial/hello/Quinto
```

Chiamata con get e parametro nella query

```
curl http://localhost:8080/rest-tutorial/hello/Quinto?name=Quinto
```

Ricerca contatti

```
curl http://localhost:8080/rest-tutorial/contacts?desc=Boselli
```