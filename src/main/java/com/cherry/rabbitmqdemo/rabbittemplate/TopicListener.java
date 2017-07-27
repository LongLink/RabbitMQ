package com.cherry.rabbitmqdemo.rabbittemplate;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class TopicListener implements MessageListener{

	public void onMessage(Message message) {
		System.out.println(message);
	}


}
