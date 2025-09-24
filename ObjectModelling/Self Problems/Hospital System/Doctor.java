package HospitalSystem;

import java.util.ArrayList;

public class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Doctor " + name + " consulted patient " + p.getName());
    }

    public String getName() {
        return name;
    }
}
