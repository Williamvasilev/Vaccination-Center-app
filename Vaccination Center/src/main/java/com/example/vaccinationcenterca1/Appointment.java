package com.example.vaccinationcenterca1;

public class Appointment {

    public String date;
    public String time;
    public String type;
    public String batchNumber;
    public String vaccinatorDetails;
    public String patientId;

    public Appointment(String date, String time, String type, String batchNumber, String vaccinatorDetails, String patientId) {
        this.date = date;
        this.time = time;
        this.type = type;
        this.batchNumber = batchNumber;
        this.vaccinatorDetails = vaccinatorDetails;
        this.patientId = patientId;
    }

    //GETTERS

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public String getVaccinatorDetails() {
        return vaccinatorDetails;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getTime() {
        return time;
    }



    //SETTERS
    public void setPatientId(String patientID) {
        this.patientId = patientID;
    }

    public void setVaccinatorDetails(String vaccinatorDetails) {
        this.vaccinatorDetails = vaccinatorDetails;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Patient Id : " + getPatientId()+ " Vaccinator Details : " + getVaccinatorDetails() + " Batch Number : " + getBatchNumber() + " Type : " +getType()+ " Date : " + getDate() + " Time : " + getTime() ;

    }
}
