package com.cherry.rabbitmqdemo.amqptemplate;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("rabbit-context-queue.xml");
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		String message = (String) amqpTemplate.receiveAndConvert("helloworld.queue");
		System.out.println(message);
	}
}
