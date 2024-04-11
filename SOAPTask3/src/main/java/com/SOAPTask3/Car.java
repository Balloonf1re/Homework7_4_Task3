package com.SOAPTask3;

import jakarta.persistence.*;

@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "mark_id")
    private int markId;
    private String model;
    private int price;


    public long getMarkId() {
        return markId;
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
    public void setId(int id) {
        this.id = id;
    }
    public void setMarkId(int markId) {
        this.markId = markId;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
