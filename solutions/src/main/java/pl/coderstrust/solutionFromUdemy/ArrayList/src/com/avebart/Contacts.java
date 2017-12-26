package pl.coderstrust.solutionFromUdemy.ArrayList.src.com.avebart;

import java.util.ArrayList;

public class Contacts {


    public ArrayList<String> contacts = new ArrayList();



    public void printMenuList(){

        System.out.println("\nPress:");
        System.out.println("\t0. to view menu");
        System.out.println("\t1. to view all contacts");
        System.out.println("\t2. to add contact");
        System.out.println("\t3. to update contact");
        System.out.println("\t4. to remove contact");
        System.out.println("\t5. to find contact");
        System.out.println("\t6. to quit menu");

    }





    public void printContacts (){
        System.out.println("You have " + contacts.size() + " contacts");
            for (int i=0; i < contacts.size(); i ++)
            System.out.println((i+1)+". "+ contacts.get(i));
    }

    public void addContact (String name){

        contacts.add(name);
    }
    public  void updateContact (String currentName, String name) {

        int position = findContact(currentName);
        if(position>=0)
            updateContact(position, name);
    }
    private void updateContact (int position, String name){

        contacts.set(position+1, name);
        System.out.println("Contact " + (position) + "was modify");
    }

    public void removeContact (String name){
        int position = findContact(name);
        if(position>=0)
            removeContact(position);
    }


    private void removeContact(int position){

        contacts.remove(position-1);
        System.out.println("Contact " + (position-1) + "has been deleted");

    }

    private int findContact(String searchContact){

        return contacts.indexOf(searchContact);
    }
    public boolean findingContact (String name){
        int position = findContact(name);
        if(position>=0){
            return true;

        }
        return false;




    }



}

