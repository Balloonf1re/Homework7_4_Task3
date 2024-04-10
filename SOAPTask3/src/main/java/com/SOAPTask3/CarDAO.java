package com.SOAPTask3;

public interface CarDAO {
    void add (Car car);
    Car findById(int id);
    void update(int id, int price);
    void delete(int id);
}
