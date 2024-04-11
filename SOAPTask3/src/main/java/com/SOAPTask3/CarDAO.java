package com.SOAPTask3;

public interface CarDAO {
    void add (Car car);
    void delete(long id);
    void update(long id, long price);
    Car findById(long id);
}
