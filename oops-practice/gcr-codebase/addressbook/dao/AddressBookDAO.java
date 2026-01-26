
import com.addressbook.model.AddressBook;
import com.addressbook.model.Contact;
import java.util.List;
import java.util.Map;

public interface AddressBookDAO {

    void createAddressBook(String bookName);

    boolean addContact(String bookName, Contact contact);

    boolean editContact(String bookName, Contact updatedContact);

    boolean deleteContact(String bookName, String firstName, String lastName);

    List<Contact> getContacts(String bookName);

    Map<String, AddressBook> getAllAddressBooks();
}
