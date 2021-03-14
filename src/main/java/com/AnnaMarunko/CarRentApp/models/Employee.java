package com.AnnaMarunko.CarRentApp.models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @ManyToOne(targetEntity = Office.class)
    @JoinColumn(name = "offices_office_id", nullable = false, insertable = false, updatable = false)
    private Office office;
    @Column(name = "offices_office_id")
    private Long offices_office_id;

    @ManyToOne(targetEntity = Job.class)
    @JoinColumn(name = "offices_office_id", nullable = false, insertable = false, updatable = false)
    private Job job;
    @Column(name = "jobs_job_id")
    private Long jobs_job_id;

    public Employee(){}

    public Employee(String last_name, String first_name, String email,
                    String password, Job job){
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
        this.password = password;
        this.job = job;
        this.jobs_job_id = job.getJob_id();
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
        this.offices_office_id = office.getId();
    }

    public Long getOffices_office_id() {
        return offices_office_id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
        this.jobs_job_id = job.getJob_id();
    }

    public Long getJobs_job_id() {
        return jobs_job_id;
    }

}
