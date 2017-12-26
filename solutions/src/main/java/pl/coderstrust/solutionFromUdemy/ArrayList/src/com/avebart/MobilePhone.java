package pl.coderstrust.solutionFromUdemy.ArrayList.src.com.avebart;

import java.util.Scanner;

public class MobilePhone extends Contacts {


    public Scanner sc = new Scanner(System.in);
    public Contacts contacts = new Contacts();


    public void phoneMenu() {
        boolean quit = false;
        int choice;

        printMenuList();

        while (!quit) {

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 0:
                    contacts.printMenuList();
                    break;

                case 1:
                    contacts.printContacts();
                    break;

                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;


            }}
        }


    public void addContact() {
        System.out.println("Enter new contact: ");
        contacts.addContact(sc.nextLine());
    }

    public void updateContact() {
        System.out.println("Enter name of contact to update: ");
        String conNo= sc.nextLine();
        System.out.println("Enter replacement contact: ");
        String newCon = sc.nextLine();
        contacts.updateContact(conNo, newCon);
    }


    public void removeContact() {
        System.out.println("Enter number of contact to remove: ");
        String delNo = sc.nextLine();
        contacts.removeContact(delNo);
    }


    public void findContact() {
        System.out.println("Enter searching contact: ");
        String searchCon = sc.nextLine();
        if(contacts.findingContact(searchCon)){
            System.out.println(searchCon + " was found in contact list.");
        } else{
            System.out.println(searchCon+ "not found in contact list.");
        }
    }


}
