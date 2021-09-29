package com.lvxp.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

@Component
public class TestEvent {

    public void listen(EurekaInstanceCanceledEvent event){
        System.out.println("下线：" + event.getServerId());
    }
}
