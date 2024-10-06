/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Satwika
 */
class HomeAddress {
    
    private String CurrentAddress;
    private int UnitNumber;
    private String street;
    private String city;
    private int zipCode;

    public String getCurrentAddress() {
        return CurrentAddress;
    }

    public void setCurrentAddress(String CurrentAddress) {
        this.CurrentAddress = CurrentAddress;
    }

    public int getUnitNumber() {
        return UnitNumber;
    }

    public void setUnitNumber(int UnitNumber) {
        this.UnitNumber = UnitNumber;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
   
}
