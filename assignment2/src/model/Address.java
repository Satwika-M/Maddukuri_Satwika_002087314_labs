/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Address {

    private String stadd1;
    private String state;
    private String city;
    private String landmark;
    private int houseno;
    private int zipcode;
    private Long mobileno;
    
    public Address(String stadd1,String state,String city,String landmark,int houseno,int zipcode,Long mobileno) {
        this.stadd1 = stadd1;
        this.state = state;
        this.city = city;
        this.landmark=landmark;
        this.houseno = houseno;
        this.zipcode = zipcode;
        this.mobileno = mobileno;
    }

    public String getStadd1() {
        return stadd1;
    }

    public void setStadd1(String stadd1) {
        this.stadd1 = stadd1;
    }

    public String getState() {
        return state;
    }

    public void setState(String stadd2) {
        this.state = state;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
    
    
}

