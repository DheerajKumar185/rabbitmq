package com.tech.lti.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class EventSink {

	public static void main(String[] args) {
		SpringApplication.run(EventSink.class, args);

	}

	@StreamListener(Sink.INPUT)
	public void messageSink(final EventMessage eventMessage) {
		System.out.println(eventMessage.getId());
		System.out.println(eventMessage.getName());
	}

}
