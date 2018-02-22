package com.ssh.event;

import java.util.Date;

public class Booking {

    private String name;

    private Long time;

    private Date date;

    public Booking() {
    }

    public Booking(String name, Long time, Date date) {
        this.name = name;
        this.time = time;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
