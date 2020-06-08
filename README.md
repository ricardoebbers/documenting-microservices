# Documenting microservices with Spring actuator

## Objetivos

(1) Navegue pelos guias do http://spring.io/guides e execute ao menos o "Build a RESTful Web Service with Spring Boot Actuator". Mostre seus resultados e impressões. Evolua o exemplo de acordo com a sua vontade e criatividade. Sinta-se à vontade para navegar pelos guias para, eventualmente, utilizar mais de um deles.

A abordagem tradicional de documentação de API é escrevendo documentos de especificação de serviço ou usando registros de serviço estático. Com um grande número de microsserviços, seria difícil manter a documentação das APIs sincronizada.

(2) Os microsserviços podem ser documentados de várias maneiras. Este exercício pretende explorar como os microsserviços podem ser documentados usando o framework Swagger. Utilize a biblioteca Springfox Swagger para documentar o primeiro exercício.

## Getting started

### Pré-requisitos
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [JDK 11](https://adoptopenjdk.net/)

### Configuração inicial
Clone repository
```
git clone https://github.com/ricardoebbers/documenting-microservices.git \
&& cd documenting-microservices
```
Build
```
./gradlew clean build
```
Run
```
./gradlew bootRun
```

### Usando o serviço
Checar o [status](http://localhost:8080/actuator/health)

Get random greeting
```
curl http://localhost:8080/greetings
```

Get greeting by id (example id = 1)
```
curl http://localhost:8080/greetings/1
```

Read the [docs](http://localhost:8080/swagger-ui.html) **// TO-DO**

