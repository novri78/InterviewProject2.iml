import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ContactManagerTest {

    @Before
    public void setupAll(){
        System.out.println("Should be Print Before All Tests");
    }
    @BeforeEach
    public void setup(){
        new ContactManager();
    }
    //PositiveTest
    @Test
    public void shouldCreateContacts(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Novri","Marizal","089623110980");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1,contactManager.getAllContacts().size());
        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .anyMatch(contact -> contact.getfName().equals("Novri") &&
                                     contact.getlName().equals("Marizal") &&
                                     contact.getPhNumber().equals("089623110980")));
    }

    @Test
    @DisplayName("@shouldn't create contact when 1st name is null")
    public void shouldThrowRunTimeExceptionWhenFNameIsNull(){
        ContactManager contactManager = new ContactManager();
        Assert.assertThrows(RuntimeException.class, () -> contactManager.addContact(null,"Marizal","089623110980"));
    }
    @Test
    @DisplayName("@shouldn't create contact when last name is null")
    public void shouldThrowRunTimeExceptionWhenLNameIsNull(){
        ContactManager contactManager = new ContactManager();
        Assert.assertThrows(RuntimeException.class, () -> contactManager.addContact("Novri",null,"089623110980"));
    }
    @Test
    @DisplayName("@shouldn't create contact when phNumber is null")
    public void shouldThrowRunTimeExceptionWhenPhNumberIsNull(){
        ContactManager contactManager = new ContactManager();
        Assert.assertThrows(RuntimeException.class, () -> contactManager.addContact("Novri","Marizal",null));
    }

    @AfterEach
    public void tearDown(){
        System.out.println("should Execute After Each Tests");
    }
    @After
    public void teardownAll(){
        System.out.println("should Be Execute at the End of Tests");
    }

    @Test
    @DisplayName("OS on Windows")
    @EnabledOnOs(value = OS.WINDOWS,disabledReason = "enabled Only On Windows")
    public void shouldCreateContactsOnlyOnWindows(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Novri","Marizal","089623110980");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1,contactManager.getAllContacts().size());
        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .anyMatch(contact -> contact.getfName().equals("Novri") &&
                        contact.getlName().equals("Marizal") &&
                        contact.getPhNumber().equals("089623110980")));
    }
    @Test
    @DisplayName("OS on MAC")
    @DisabledOnOs(value = OS.MAC,disabledReason = "Disable On MAC")
    public void shouldNotCreateContactsOnMAC(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Novri","Marizal","089623110980");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1,contactManager.getAllContacts().size());
        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .anyMatch(contact -> contact.getfName().equals("Novri") &&
                        contact.getlName().equals("Marizal") &&
                        contact.getPhNumber().equals("089623110980")));
    }
    @Test
    @DisplayName("test contact creation on Dev Machine")
    public void shouldTestContactCreationOnDevMachine(){
        Assumptions.assumeFalse("TEST".equals(System.getProperty("ENV")));
        ContactManager contactmanager = new ContactManager();
        contactmanager.addContact("Novri","Marizal","089623110980");
        Assertions.assertFalse(contactmanager.getAllContacts().isEmpty());
        Assertions.assertFalse(contactmanager.getAllContacts().isEmpty());
    }

    @DisplayName("RepeatContactCreationTests5Times")
    @RepeatedTest(value = 5)
    public void shouldRepeatContactCreationTests5Times(){
        ContactManager contactmanager = new ContactManager();
        contactmanager.addContact("Novri","Marizal","089623110980");
        Assertions.assertFalse(contactmanager.getAllContacts().isEmpty());
        assertEquals(true, contactmanager.getAllContacts().isEmpty());
    }

}