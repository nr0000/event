package com.ssh.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class AService {

    @Autowired
    private ApplicationContext context;

    public void book(Booking booking){
        BookingCreatedEvent bookingCreatedEvent = new BookingCreatedEvent(this, booking);
        //发布事件
        context.publishEvent(bookingCreatedEvent);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成预定");
    }
}
