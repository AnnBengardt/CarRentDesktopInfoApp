package com.AnnaMarunko.CarRentApp;

import com.AnnaMarunko.CarRentApp.models.*;
import com.AnnaMarunko.CarRentApp.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
        /* String date1 = "31/10/2020";
        String date2 = "04/11/2027";
        Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        Date date4 = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
        Office office = new Office("Moscow", "Rokossovskogo boulevard",
                "office2@cars.ru", "Pyotr Petrov");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(office);
        transaction.commit();
        Car car = new Car("mercedes", 3000.0, true, office);
        Insurance insurance = new Insurance(date3, date4, 25000.0);
        car.setInsurance(insurance);
        Transaction transaction1 = session.beginTransaction();
        session.save(insurance);
        session.save(car);
        transaction1.commit();
        session.close();*/
        Office office = new Office("Novgorod", "Prospekt Lenina",
                "office3@cars.ru", "Ekaterina Romanova");
        Job job = new Job("Manager");
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(office);
        session.save(job);
        transaction.commit();
        Employee employee = new Employee("Romanova", "Ekaterina", "EkRomanova@cars.ru",
                "Gdrty562FeoQ1", job);
        employee.setOffice(office);
        Transaction transaction1 = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();

    }
}
