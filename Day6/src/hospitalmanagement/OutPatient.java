package hospitalmanagement;

public class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private double consultationFee;
    private String medicalRecords;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Single consultation fee for Outpatient
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
