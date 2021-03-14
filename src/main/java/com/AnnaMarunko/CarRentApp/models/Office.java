package com.AnnaMarunko.CarRentApp.models;

import javax.persistence.*;

@Entity
@Table(name = "offices")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long office_id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "email")
    private String email;

    @Column(name = "manager")
    private String mangerLastName;

    public Office(){}

    public Office(String city, String street, String email, String manager){
        this.city = city;
        this.street = street;
        this.email = email;
        this.mangerLastName = manager;
    }

    public Long getId() {
        return office_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMangerLastName() {
        return mangerLastName;
    }

    public void setMangerLastName(String mangerLastName) {
        this.mangerLastName = mangerLastName;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + office_id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", email='" + email + '\'' +
                ", mangerLastName='" + mangerLastName + '\'' +
                '}';
    }
}
