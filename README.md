# Kafka Demo Project Java 11 

* spring boot project
* Kafka in dependency with Web
* Controller to fetch messages from client
* Producer who push these messages / events to topic
* Consumer to listen to it
* Application.properties to configure producer properties


___
### GET REQUEST

### Start the ZooKeeper service
````
bin/zookeeper-server-start.sh config/zookeeper.properties
````
### Start the Kafka broker service
```
bin/kafka-server-start.sh config/server.properties
```
### Run the Consumer
```
bin/kafka-console-consumer.sh --topic kafkaDemo_Topic --from-beginning --bootstrap-server localhost:9092
```
___
### API Request
```
http://localhost:8080/rest/api/producerMsg?message=hello
```
___
## Others
### Java 11
### Maven
### Spring Boot
### Kafka
### Topic name : kafkaDemo_Topic
### 





[T](https://www.youtube.com/watch?v=WOPPG5tyApg)