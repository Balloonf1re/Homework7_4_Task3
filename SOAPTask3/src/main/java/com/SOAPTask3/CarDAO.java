package com.SOAPTask3;

public interface CarDAO {
    void add (Car car);
    void delete(int id);
    void update(int id, int price);
    Car findById(int id);
}
