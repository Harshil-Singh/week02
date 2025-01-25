package hospitalmanagement;

public class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private String treatment;
    private double dailyCharge;
    private String medicalRecords;

    public InPatient(int patientId, String name, int age, double dailyCharge) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.medicalRecords = "";
    }

    @Override
    public double calculateBill() {
        return dailyCharge * 5; // 5 days stay, can be dynamic as per the requirement
    }

    @Override
    public void addRecord(String record) {
        medicalRecords += record + "\n";
    }

    @Override
    public String viewRecords() {
        return medicalRecords;
    }
}
