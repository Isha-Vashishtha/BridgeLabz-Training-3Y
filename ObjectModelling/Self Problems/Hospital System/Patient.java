package HospitalSystem;

import java.util.ArrayList;

public class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) doctors.add(d);
    }

    public String getName() {
        return name;
    }
}
