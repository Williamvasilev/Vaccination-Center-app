package com.example.vaccinationcenterca1;

public class Booth {

    private String boothIdentifier;
    private String floorLevel;
    private String accessibility;
    public GeneralList<Appointment> appointmentList=new GeneralList<>();



    public Booth(String boothIdentifier, String floorLevel, String accessibility) {
        this.boothIdentifier = boothIdentifier;
        this.floorLevel = floorLevel;
        this.accessibility = accessibility;
    }

    //GETTERS

    public String getBoothIdentifier() {
        return boothIdentifier;
    }

    public String getFloorLevel() {
        return floorLevel;
    }

    public String getAccessibility() {
        return accessibility;
    }

    //SETTERS

    public void setBoothIdentifier(String boothIdentifier) {
        this.boothIdentifier = boothIdentifier;
    }

    public void setFloorLevel(String floorLevel) {
        this.floorLevel = floorLevel;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    @Override
    public String toString() {
        return "Booth ID : " +getBoothIdentifier() + " Floor level : " + getFloorLevel() + " Accessibility : " + getAccessibility();

    }

}
