package com.SOAPTask3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CarDAOImplementation implements CarDAO {
    private final SessionFactory sessionFactory;

    public CarDAOImplementation() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    @Override
    public void add(Car car) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void delete(long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Car car = findById(id);
        session.delete(car);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(long id, long price) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Car car = findById(id);
        car.setPrice(price);
        session.saveOrUpdate(car);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Car findById(long id) {
        Session session = sessionFactory.openSession();
        Car car = session.get(Car.class, id);
        session.close();
        return car;
    }
}
