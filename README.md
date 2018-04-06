#WS Rest Tutorial


Chiamata con post

```
curl -d "name=Quinto" -X POST http://localhost:8080/mininal-ws-provider-rest/hello
```

Chiamata con get

```
curl http://localhost:8080/mininal-ws-provider-rest/helloWorld
```

Chiamata con get e parametro nella url

```
curl http://localhost:8080/mininal-ws-provider-rest/hello/Quinto
```

Chiamata con get e parametro nella query

```
curl http://localhost:8080/mininal-ws-provider-rest/hello/Quinto?name=Quinto
```