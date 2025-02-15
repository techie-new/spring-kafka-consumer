package com.satya.service;


import com.satya.DTO.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
    private final String topic = "k-topic";

   /* @KafkaListener(topics = topic, groupId = "consumerGroup2")
    public void consume1(String message) {
        log.info("Consumer 1 consuming the messages : [ "+message+" ] from topic : ["+topic+"]");
    }

    @KafkaListener(topics = topic, groupId = "consumerGroup2")
    public void consume2(String message) {
        log.info("Consumer2 consuming the messages : [ "+message+" ] from topic : ["+topic+"]");
    }

    @KafkaListener(topics = topic, groupId = "consumerGroup2")
    public void consume3(String message) {
        log.info("Consumer3 consuming the messages : [ "+message+" ] from topic : ["+topic+"]");
    }

    @KafkaListener(topics = topic, groupId = "consumerGroup2")
    public void consume4(String message) {
        log.info("Consumer4 consuming the messages : [ "+message+" ] from topic : ["+topic+"]");
    }

    @KafkaListener(topics = topic, groupId = "consumerGroup2")
    public void consume5(Customer message) {
        log.info("Consumer5 consuming the messages : [ "+message.toString()+" ] from topic : ["+topic+"]");
    }*/

    //This consumer is listening on partition 2 only
    @KafkaListener(topics = topic, groupId = "consumerGroup2", topicPartitions = {@TopicPartition(topic = topic, partitions = {"2"})})
    public void consume6(Customer message) {
        log.info("Consumer::Partition->2 consuming the messages : [ {} ] from topic : [" + topic + "]", message.toString());
    }

    //This consumer is listening on partition 3 only.
    @KafkaListener(topics = topic, groupId = "consumerGroup2", topicPartitions = {@TopicPartition(topic = topic, partitions = {"3"})})
    public void consume7(String message) {
        log.info("Consumer::Partition->3 consuming the messages : [ {} ] from topic : [" + topic + "]", message);
    }

}
