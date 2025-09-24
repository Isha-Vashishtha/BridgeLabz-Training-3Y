package HospitalSystem;

public class MainHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Adams");
        Doctor d2 = new Doctor("Dr. Brown");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.showHospital();

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);
    }
}
