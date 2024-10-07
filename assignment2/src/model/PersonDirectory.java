/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class PersonDirectory {
    
     private ArrayList<Person> persons;
        
        
        public PersonDirectory(){
            this.persons= new ArrayList<Person>();
        }

    public ArrayList<Person> getAccounts() {
        return persons;
    }

    public void setAccounts(ArrayList<Person> accounts) {
        this.persons = persons;
    }
        
    public Person addAccount(){
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    public void deleteAccount(Person person){
        persons.remove(person);
    }
    
//    public Person searchAccount(String accountnumber){
//        for(Person a: accounts){
//            if(a.getAccountNumber().contains(accountnumber)){
//                return a;
//            }
//        }
//        return null;
//    }
    
   
     public Person searchAccount(long accountnumber) {
        for (Person p : persons) {
            if (p.getSsn() == accountnumber) {
                return p;
            }
        }
        return null;
    }

    // Overloaded method to search by name or address
    public Person searchAccount(String searchValue) {
    for (Person p : persons) {
        // Check all attributes and handle `null` values safely
        if (p.getFirstName() != null && p.getFirstName().equalsIgnoreCase(searchValue)) {
            return p;
        } else if (p.getLastName() != null && p.getLastName().equalsIgnoreCase(searchValue)) {
            return p;
        } else if (p.getPerhomeAdd() != null && p.getPerhomeAdd().getStadd1()!= null &&
                   p.getPerhomeAdd().getStadd1().equalsIgnoreCase(searchValue)) {
            return p;
        } 
//        else if (p.getPrehomeAdd() != null && p.getPrehomeAdd().equalsIgnoreCase(searchValue)) {
//            return p;
//        }
    }
    return null;
}

}
