import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {
    Map<String, Contact> contactList = new ConcurrentHashMap<>();

    public void addContact(String fName, String lname, String phNumber){
        Contact contact = new Contact(fName,lname,phNumber);
        validateContact(contact);
        checkIfContactAlreadyExist(contact);
        contactList.put(generateKey(contact),contact);

    }
    public Collection<Contact> getAllContacts() {
        return contactList.values();
    }

    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getfName(), contact.getlName());
    }

    private void checkIfContactAlreadyExist(Contact contact) {
        if (contactList.containsKey(generateKey(contact)))
            throw new RuntimeException("Contact Already Exist");
    }

    private void validateContact(Contact contact) {
        contact.validatefName();
        contact.validatelName();
        contact.validatephNumber();
    }

}
