package com.som.home.publisher;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.som.home.publisher")
@PropertySource("application.properties")
public class RabbitConfiguration {

	@Value("${fanout.exchange}")
	private String queueName;

	@Value("${queue.name}")
	private String fanoutExchange;

	@Bean
	Queue queue() {
		return new Queue(queueName, true);
	}

	@Bean
	FanoutExchange exchange() {
		return new FanoutExchange(fanoutExchange);
	}

	@Bean
	Binding binding(Queue queue, FanoutExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange);
	}
	
}
