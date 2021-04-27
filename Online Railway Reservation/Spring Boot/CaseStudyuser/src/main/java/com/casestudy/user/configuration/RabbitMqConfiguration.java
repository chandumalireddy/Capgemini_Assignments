/*
 * package com.casestudy.user.configuration;
 * 
 * import org.springframework.amqp.core.AmqpTemplate; import
 * org.springframework.amqp.core.Binding; import
 * org.springframework.amqp.core.BindingBuilder; import
 * org.springframework.amqp.core.Queue; import
 * org.springframework.amqp.core.TopicExchange; import
 * org.springframework.amqp.rabbit.connection.CachingConnectionFactory; import
 * org.springframework.amqp.rabbit.connection.ConnectionFactory; import
 * org.springframework.amqp.rabbit.core.RabbitTemplate; import
 * org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
 * import org.springframework.amqp.support.converter.MessageConverter; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * 
 * 
 * 
 * 
 * @Configuration public class RabbitMqConfiguration {
 * 
 * final static String EXCHANGE="message_queue_exchange"; final static String
 * QUEUE="message_queue"; public static final String
 * ROUTING_KEY="onlinerailway";
 * 
 * @Autowired RabbitTemplate rabbitTemplate;
 * 
 * @Bean Queue queue() {return new Queue(QUEUE,false); }
 * 
 * @Bean TopicExchange exchange() { return new TopicExchange(EXCHANGE); }
 * 
 * @Bean Binding binding(org.springframework.amqp.core.Queue queue,TopicExchange
 * exchange) { return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
 * }
 * 
 * @Bean public MessageConverter converter() { return new
 * Jackson2JsonMessageConverter(); }
 * 
 * @Bean public AmqpTemplate template(ConnectionFactory connectionFactory) {
 * RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
 * rabbitTemplate.setMessageConverter(converter()); return rabbitTemplate; } }
 * 
 */