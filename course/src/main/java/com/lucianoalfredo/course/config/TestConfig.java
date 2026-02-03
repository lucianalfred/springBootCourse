package com.lucianoalfredo.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucianoalfredo.course.entities.Order;
import com.lucianoalfredo.course.entities.User;
import com.lucianoalfredo.course.entities.enums.OrderStatus;
import com.lucianoalfredo.course.repositories.OrderRepository;
import com.lucianoalfredo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository	userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"Maria", "maria@gmail.com", "99999", "123456");
		User u2 = new User(null,"Alex Green", "maria@gmail.com", "97777", "123456");
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.WAITTING_PAYMENT);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2,  OrderStatus.WAITTING_PAYMENT);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1,  OrderStatus.WAITTING_PAYMENT); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
}
