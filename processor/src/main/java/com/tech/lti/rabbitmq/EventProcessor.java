package com.tech.lti.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(Processor.class)
public class EventProcessor {
	
	public static void main(String[] args) {
		SpringApplication.run(EventProcessor.class, args);

	}
	
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
	public EventMessage eventProcessor(final EventMessage eventMessage) {
		System.out.println(eventMessage.getId());
		System.out.println(eventMessage.getName());
		return eventMessage;
	}

}
