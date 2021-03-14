package com.AnnaMarunko.CarRentApp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "starting_price")
    private Double starting_price;

    @Column(name = "status")
    private Boolean status;

    //insurance_id не сохраняется - пофиксить
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "insurances_insurance_id", insertable=false, updatable=false)
    @JsonIgnore
    private Insurance insurance;
    @Column(name = "insurances_insurance_id")
    private Long insurances_insurance_id;

    @ManyToOne(targetEntity = Office.class)
    @JoinColumn(name = "offices_office_id", nullable = false, insertable = false, updatable = false)
    private Office office;
    @Column(name = "offices_office_id")
    private Long offices_office_id;

    public Car(){}

    public Car(String brand, Double starting_price, Boolean status, Office office){
        this.brand = brand;
        this.starting_price = starting_price;
        this.status = status;
        this.office = office;
        this.offices_office_id = office.getId();
    }

    public Long getId() {
        return car_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getStarting_price() {
        return starting_price;
    }

    public void setStarting_price(Double starting_price) {
        this.starting_price = starting_price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
        this.insurances_insurance_id = insurance.getInsurance_id();
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + car_id +
                ", brand='" + brand + '\'' +
                ", starting_price=" + starting_price +
                ", status=" + status +
                ", insurances_insurance_id=" + insurances_insurance_id +
                ", office=" + office.getId() +
                '}';
    }
}
