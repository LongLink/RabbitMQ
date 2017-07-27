package com.cherry.rabbitmqdemo.rabbittemplate;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TopicTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("rabbit-context-topic.xml");
		RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);
		rabbitTemplate.convertAndSend("Topic Listener Test");
		Thread.sleep(1000);
		context.destroy();
	}
}
