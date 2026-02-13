package org.example.service;

import org.example.dao.AddressBookDAO;
import org.example.model.Contact;

import java.util.List;

public class AddressBookServiceImpl implements AddressBookService {

    private AddressBookDAO dao;

    public AddressBookServiceImpl(AddressBookDAO dao) {
        this.dao = dao;
    }

    @Override
    public void addContact(Contact contact) {

        // Business logic: Duplicate check
        if (dao.getAllContacts().contains(contact)) {
            System.out.println("Duplicate Contact Not Allowed!");
        } else {
            dao.addContact(contact);
            System.out.println("Contact Added Successfully!");
        }
    }

    @Override
    public void deleteContact(String firstName) {

        // Validation
        if (dao.getAllContacts().isEmpty()) {
            System.out.println("Address Book is Empty!");
            return;
        }

        dao.deleteContact(firstName);
        System.out.println("Contact Deleted!");
    }

    @Override
    public List<Contact> getAllContacts() {
        return dao.getAllContacts();
    }
}
