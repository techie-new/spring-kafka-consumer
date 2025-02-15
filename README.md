# spring-kafka-consumer

# Spring-kafka Consumer Example

## **About**
This module covers a basic example of a spring kafka consumer application. This module contains java spring boot code.

### **Steps to run this spring boot app in local**

#### **Step 1**: Clone the repository in your machine

#### https://github.com/techie-new/spring-kafka-consumer.git

#### **Step 2:** Install/download kafka

#### **Step 3**: Open terminal/cmd from kafka folder path

->**Use below command to start Zookeeper , kafka server**

     1. Start Zookeeper Server
      sh bin/zookeeper-server-start.sh config/zookeeper.properties

     2.Start Kafka Server / Broker
      sh bin/kafka-server-start.sh config/server.properties

     3.Create topic
       sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic k-topic --partitions 3 --replication-factor 1

     4.list out all topic names
      sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --list

     5. Describe topics
       sh bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic k-topic

     6. Produce message
       sh bin/kafka-console-producer.sh --broker-list localhost:9092 --topic k-topic

     7.consume message
        sh bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic k-topic --from-beginning

#### **Step 4:** Run the spring-boot app


#### Optional - install **offset explorer** to see centralize view for all topics, consumers, & messages