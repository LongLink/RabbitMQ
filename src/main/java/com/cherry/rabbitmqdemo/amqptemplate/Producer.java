package com.cherry.rabbitmqdemo.amqptemplate;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("rabbit-context-queue.xml");
 		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
 		amqpTemplate.convertAndSend("helloworld.queue", "Hello World");
	}
}
