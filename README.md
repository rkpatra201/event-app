# event-app
both are spring boot apps.
```
run: mvn spring-boot:run
```

````
emitter: is on port : 8080
collector: is on port: 8081
access emitter API : http://localhost:8080/events/emit/
access collector api: http://localhost:8081/metrics/1/  [here 1 is last 1 minute]. Similarly you can pass any integer between 0 and 30.
````
