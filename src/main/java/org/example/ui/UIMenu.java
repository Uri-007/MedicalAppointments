package org.example.ui;

import org.example.model.Doctor;
import org.example.model.Pattient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Pattient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to my Appointments");
        System.out.println("Select the desired option");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Go out");

            Scanner sc = new Scanner(System.in);

            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response !=0);
    }

    private static void authUser(int userType) {
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Lesly Lopez", "lesly@gmail.com"));
        doctors.add(new Doctor("Adrii Ayala", "adri@gmail.com"));
        doctors.add(new Doctor("Urii Cesar", "urii@gmail.com"));

        ArrayList<Pattient> patiens = new ArrayList<>();
        patiens.add(new Pattient("Diana Juarez", "diana@gmail.com"));
        patiens.add(new Pattient("Dalia Cesar", "dalia@gmail.com"));
        patiens.add(new Pattient("Paola Juarez", "paola@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1) {
                for (Doctor d: doctors) {
                    if(d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Get the logged in user
                        doctorLogged = d;
                        //ShowDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType == 2) {
                for (Pattient p: patiens) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        //showPatientMenu
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        } while (!emailCorrect);

    }

    static  void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Book appointments");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        } while (response != 0);
    }

}
