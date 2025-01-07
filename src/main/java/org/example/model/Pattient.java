package org.example.model;

import java.util.ArrayList;
import java.util.Date;

public class Pattient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppoinmentDoctor> appoinmentDoctors = new ArrayList<>();
    private ArrayList<AppoinmentNurse> appoinmentNurses = new ArrayList<>();

    public ArrayList<AppoinmentDoctor> getAppoinmentDoctors() {
        return appoinmentDoctors;
    }

    public void addAppoinmentDoctors(Doctor doctor, Date date, String time) {
        AppoinmentDoctor appoinmentDoctor = new AppoinmentDoctor(this, doctor);
        appoinmentDoctor.schedule(date,time);
        appoinmentDoctors.add(appoinmentDoctor);
    }

    public ArrayList<AppoinmentNurse> getAppoinmentNurses() {
        return appoinmentNurses;
    }

    public void setAppoinmentNurses(ArrayList<AppoinmentNurse> appoinmentNurses) {
        this.appoinmentNurses = appoinmentNurses;
    }

    public Pattient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " kg. ";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Wight: " + getWeight() + "\nHeight: " + getHeight() + "\n Blood: " + blood ;
    }

    @Override
    public void showDataUser() {
        System.out.println("Patient");
        System.out.println("Complete history since birth");

    }
}
