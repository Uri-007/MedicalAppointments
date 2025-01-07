package org.example.model;

public class Nurse extends User {

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Green Cross");
        System.out.println("Department: Nutrition, pediatrics");

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

