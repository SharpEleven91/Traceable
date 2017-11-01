package tests;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    Fingerprint testFingerprint;
    Person testPerson;

    @Before
    public void setup() {
        testPerson = new Person(26, "Cody Biller", "Toledo");
        testFingerprint = new Fingerprint(testPerson, "Toledo PD");
    }

    @Test
    public void testPersonAddFingerprint() {
        testPerson.setFingerprint(testFingerprint);
        assertEquals(testPerson.getFingerprint(), testFingerprint);
    }

}
