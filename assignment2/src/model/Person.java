/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String gender;
    private long ssn;
    private Address perhomeAdd;
    private Address prehomeAdd;
    private float salary;
    private int employeeid;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public Address getPerhomeAdd() {
        return perhomeAdd;
    }

    public void setPerhomeAdd(Address perhomeAdd) {
        this.perhomeAdd = perhomeAdd;
    }

    public Address getPrehomeAdd() {
        return prehomeAdd;
    }

    public void setPrehomeAdd(Address prehomeAdd) {
        this.prehomeAdd = prehomeAdd;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    
    
    
        public String toString(){
        return getFirstName();
    }
    
}
