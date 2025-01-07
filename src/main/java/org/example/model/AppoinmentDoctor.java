package org.example.model;

import java.util.Date;

public class AppoinmentDoctor implements ISchedulable  {
    private int id;
    private Pattient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppoinmentDoctor(Pattient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pattient getPatient() {
        return patient;
    }

    public void setPatient(Pattient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
