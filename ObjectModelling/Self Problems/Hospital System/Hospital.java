package HospitalSystem;

public class Hospital {
    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void showHospital() {
        System.out.println("Hospital: " + hospitalName);
    }
}
