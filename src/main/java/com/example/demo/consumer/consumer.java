package com.example.demo.consumer;




import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.dto.orderstatus;


@Component
public class consumer {
    
    @RabbitListener(queues = "dbs_queue_batch18")
    public void consumeMessageFromQueue(orderstatus os) {
        System.out.println("Message recieved from queue : " + os);
    }




}
