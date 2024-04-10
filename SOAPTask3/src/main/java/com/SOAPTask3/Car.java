package com.SOAPTask3;

import jakarta.persistence.*;

@Entity(name = "com.SOAPTask3.Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "mark_id")
    private long markId;
    private String model;
    private long price;

    public void setId(long id) {
        this.id = id;
    }
    public long getMarkId() {
        return markId;
    }
    public void setMarkId(long markId) {
        this.markId = markId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
}
