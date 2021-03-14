package com.AnnaMarunko.CarRentApp.models;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_id;

    @Column(name = "job_name")
    private String job_name;

    public Job(){}

    public Job(String name){
        this.job_name = name;
    }

    public Long getJob_id() {
        return job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
}
