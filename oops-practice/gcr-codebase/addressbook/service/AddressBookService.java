

import com.addressbook.model.Contact;
import java.util.List;
import java.util.Map;

public interface AddressBookService {

    void createAddressBook(String bookName);

    boolean addContact(String bookName, Contact contact);

    boolean editContact(String bookName, String firstName, String lastName);

    boolean deleteContact(String bookName, String firstName, String lastName);

    List<Contact> getAllContacts(String bookName);

    List<Contact> searchByCity(String city);

    List<Contact> searchByState(String state);

    Map<String, List<Contact>> viewByCity();

    Map<String, List<Contact>> viewByState();

    Map<String, Integer> countByCity();

    Map<String, Integer> countByState();

    List<Contact> sortByName(String bookName);

    List<Contact> sortByCity(String bookName);

    List<Contact> sortByState(String bookName);

    List<Contact> sortByZip(String bookName);
}
