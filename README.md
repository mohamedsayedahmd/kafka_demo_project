# kafka demo project

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
[Thx](https://www.youtube.com/watch?v=WOPPG5tyApg)