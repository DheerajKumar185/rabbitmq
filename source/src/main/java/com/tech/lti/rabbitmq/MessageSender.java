package com.tech.lti.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Source.class)
public class MessageSender {
	
	@Autowired
	private Source eventSource;
	
	@Async
	public void publishEventMessage(final EventMessage eventMessage) {
		eventSource.output().send(MessageBuilder.withPayload(eventMessage).build());
	}

}
