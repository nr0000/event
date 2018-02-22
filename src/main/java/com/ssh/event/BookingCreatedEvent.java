package com.ssh.event;

import org.springframework.context.ApplicationEvent;

public class BookingCreatedEvent extends ApplicationEvent{

    private Booking booking;

    public BookingCreatedEvent(Object source) {
        super(source);
    }

    public BookingCreatedEvent(Object source, Booking booking) {
        super(source);
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
