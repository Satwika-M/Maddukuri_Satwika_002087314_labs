/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Satwika
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    private ArrayList<HomeAddress> homeAddress;
    private ArrayList<WorkAddress> workAddress;
    public PersonDirectory(){
        this.persons = new ArrayList<Person>();
        this.homeAddress = new ArrayList<HomeAddress>();
        this.workAddress = new ArrayList<WorkAddress>();
    }
    
    public ArrayList<Person> getPerson(){
        return persons;
    }
    
    public ArrayList<HomeAddress> getHomeAddress(){
        return homeAddress;
    }
    
    public ArrayList<WorkAddress> getWorkAddress(){
        return workAddress;
    }
    
    public void SetPerson(ArrayList<Person> persons){
        this.persons = persons;
    }
    
    public void SetHomeAddress(ArrayList<HomeAddress> homeAddress){
        this.homeAddress = homeAddress;
    }
    
    public void SetWorkAddress(ArrayList<WorkAddress> workAddress){
        this.workAddress = workAddress;
    }
    
    public Person addPerson(){
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
     public HomeAddress addHomeAddress (){
        HomeAddress h = new HomeAddress();
        homeAddress.add(h);
        return h;
    }
     
      public WorkAddress addWorkAddress(){
        WorkAddress w = new WorkAddress();
        workAddress.add(w);
        return w;
    }
    
    
    
    public void deletePerson(Person person){
        persons.remove(person);
    }
    
    public Person searchAccount(String accountNumber){
        for(Person a : persons){
            if(a.getAccountNumber().contains(accountNumber)){
                return a;
            }
        } 
        return null;
    }
}
