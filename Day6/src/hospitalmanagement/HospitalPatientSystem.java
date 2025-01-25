package hospitalmanagement;

public class HospitalPatientSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "John Doe", 30, 100);
        Patient outPatient = new OutPatient(102, "Jane Smith", 25, 50);

        inPatient.getPatientDetails();
        System.out.println("Total Bill (InPatient): $" + inPatient.calculateBill());

        System.out.println();

        outPatient.getPatientDetails();
        System.out.println("Total Bill (OutPatient): $" + outPatient.calculateBill());

        System.out.println();

        // Managing Medical Records
        MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
        inPatientRecord.addRecord("Diagnosis: Fever");
        inPatientRecord.addRecord("Treatment: Rest and Hydration");

        System.out.println("InPatient Medical Records: ");
        System.out.println(inPatientRecord.viewRecords());

        System.out.println();

        MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
        outPatientRecord.addRecord("Diagnosis: Cold");
        outPatientRecord.addRecord("Treatment: Cough Syrup");

        System.out.println("OutPatient Medical Records: ");
        System.out.println(outPatientRecord.viewRecords());
    }
}
