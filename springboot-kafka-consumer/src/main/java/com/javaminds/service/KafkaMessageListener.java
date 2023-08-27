package com.javaminds.service;

import com.javaminds.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics="user-tracking-3",groupId = "user-group-1")
    public void consume1(String message){
        log.info("consumer1 consume the message {} ",message);
    }

//    @KafkaListener(topics="user-tracking-2",groupId = "user-group-1")
//    public void consume2(String message){
//        log.info("consumer2 consume the message {} ",message);
//    }
//
//    @KafkaListener(topics="user-tracking-1",groupId = "user-group-1")
//    public void consume3(String message){
//        log.info("consumer3 consume the message {} ",message);
//    }


    @KafkaListener(topics="user-tracking-4",groupId = "user-group-1")
    public void consume4(Customer customer){
        log.info("consumer1 consume the customer {} ",customer);
    }


}
