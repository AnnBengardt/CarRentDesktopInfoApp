package com.AnnaMarunko.CarRentApp.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "insurances")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long insurance_id;

    @Column(name = "ins_start")
    private Date ins_start;

    @Column(name = "ins_end")
    private Date ins_end;

    @Column(name = "price")
    private Double price;

    //добавить столбец not null car_id
    @OneToOne(mappedBy = "insurance", orphanRemoval = true)
    Car car;

    public Insurance(){};

    public Insurance(Date start, Date end, Double price){
        this.ins_start = start;
        this.ins_end = end;
        this.price = price;
    }

    public Long getInsurance_id() {
        return insurance_id;
    }

    public Date getStart() {
        return ins_start;
    }

    public void setStart(Date start) {
        this.ins_start = start;
    }

    public Date getEnd() {
        return ins_end;
    }

    public void setEnd(Date end) {
        this.ins_end = end;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insurance_id=" + insurance_id +
                ", start=" + ins_start +
                ", end=" + ins_end +
                ", price=" + price +
                '}';
    }
}
