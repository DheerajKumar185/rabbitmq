# Spring Boot + RabbitMQ
1. Java 1.8, Spring Boot 1.5.9, Spring Cloud RabbitMQ 1.3
2. curl --location 'localhost:8086/postMessage' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "name": "Abc"
}'
