package com.ssh.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BookingEventsListener implements ApplicationListener<BookingCreatedEvent> {
    @Override
    public void onApplicationEvent(BookingCreatedEvent bookingCreatedEvent) {

        String name = bookingCreatedEvent.getBooking().getName();
        System.out.println(name);
    }
}
