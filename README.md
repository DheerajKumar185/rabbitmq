# Spring Boot + RabbitMQ
1. Java 1.8, Spring Boot 1.5.9, Spring Cloud RabbitMQ 1.3
2. curl --location 'localhost:8086/postMessage' \
--header 'Content-Type: application/json' \
--data '{
    "id": 1,
    "name": "Abc"
}'
# Description:
   1. source: It's a Producer. It'll send event into Queue
   2. processor: It's Consumer & Producer both. It'll consume data from Queue and then send back event into Queue again.
   3. sink: It's a Consumer. It'll consume data from Queue.
