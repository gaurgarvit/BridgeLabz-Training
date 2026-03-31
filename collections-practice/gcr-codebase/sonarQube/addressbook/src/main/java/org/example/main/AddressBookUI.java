package org.example.main;

import org.example.dao.AddressBookDAOImpl;
import org.example.model.Contact;
import org.example.service.AddressBookService;
import org.example.service.AddressBookServiceImpl;

import java.util.Scanner;

public class AddressBookUI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBookService service =
                new AddressBookServiceImpl(new AddressBookDAOImpl());

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. View All Contacts");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("First Name: ");
                    String first = sc.nextLine();

                    System.out.print("Last Name: ");
                    String last = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    Contact contact =
                            new Contact(first, last, city, state, phone);

                    service.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter First Name to Delete: ");
                    service.deleteContact(sc.nextLine());
                    break;

                case 3:
                    service.getAllContacts()
                            .forEach(System.out::println);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
