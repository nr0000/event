package com.ssh.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventApplicationTests {
	@Autowired
	private AService aService;

	@Test
	public void contextLoads() {
		Booking booking = new Booking("aaa",System.currentTimeMillis(),new Date());
		aService.book(booking);
		try {
			Thread.sleep(9999);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
