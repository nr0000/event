package com.ssh.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component//注意监听器要被spring管理
public class BookingEventsListener implements ApplicationListener<BookingCreatedEvent> {
    @Override
    public void onApplicationEvent(BookingCreatedEvent bookingCreatedEvent) {
        System.out.println("进入时间监听器");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //发邮件、发短信
        String name = bookingCreatedEvent.getBooking().getName();
        System.out.println("发邮件、发短信给：" + name);
    }
}
