package com.example.vaccinationcenterca1;

public class VaccinationCenter {

    private String Name;
    private String Address;
    private String Eircode;
    private String ParkingSpaces;
    public GeneralList<Booth> boothList=new GeneralList<>();

    public VaccinationCenter(String name, String address, String eircode, String parkingSpaces) {
        this.Name = name;
        this.Address = address;
        this.Eircode = eircode;
        this.ParkingSpaces = parkingSpaces;
    }

    //GETTERS
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getEircode() {
        return Eircode;
    }

    public String getParkingSpaces() {
        return ParkingSpaces;
    }

    //SETTERS
    public void setParkingSpaces(String parkingSpaces) {
        ParkingSpaces = parkingSpaces;
    }

    public void setEircode(String eircode) {
        Eircode = eircode;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Vaccination Center : " + getName()+ " Address : " + getAddress() + " Eircode : " + getEircode() + " Parking spaces : " +getParkingSpaces();

    }
}
