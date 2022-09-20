package com.example.vaccinationcenterca1;

public class Patient {

private String patientId;
private String patientName;
private String dateOfBirth;
private String eircode;
private String patientAccessibility;
    public GeneralList<Appointment> patientList=new GeneralList<>();

    public Patient(String patientId, String patientName, String dateOfBirth, String eircode, String patientAccessibility) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
        this.eircode = eircode;
        this.patientAccessibility = patientAccessibility;
    }

    //GETTERS
    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEircode() {
        return eircode;
    }

    public String getPatientAccessibility() {
        return patientAccessibility;
    }
    //SETTERS
    public void setPatientAccessibility(String patientAccessibility) {
        this.patientAccessibility = patientAccessibility;
    }

    public void setEircode(String eircode) {
        this.eircode = eircode;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Patient id : " + getPatientId() + " Patient name : " + getPatientName() + " Date of birth : " + getDateOfBirth() + " Eircode : " + getEircode() + " Accessibility : " + getPatientAccessibility() ;

    }
}
