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
    public PersonDirectory(){
        this.persons = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getAccounts(){
        return persons;
    }
    public void SetAccounts(ArrayList<Person> accounts){
        this.persons = accounts;
    }
    public Person addAccount(){
        Person a = new Person();
        persons.add(a);
        return a;
    }
    public void deleteAccount(Person person){
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
