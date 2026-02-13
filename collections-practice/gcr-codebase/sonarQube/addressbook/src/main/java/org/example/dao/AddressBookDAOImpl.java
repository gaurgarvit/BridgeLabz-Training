package org.example.dao;

import org.example.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDAOImpl implements AddressBookDAO {

    private List<Contact> contactList = new ArrayList<>();

    @Override
    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    @Override
    public void deleteContact(String firstName) {
        contactList.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactList;
    }
}
