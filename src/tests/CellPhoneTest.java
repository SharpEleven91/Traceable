package tests;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class CellPhoneTest {

    CellPhone testCellOne;
    CellPhone testCellTwo;
    Person testPersonOne;
    Person testPersonTwo;
    Call testCallOne;
    Call testCallTwo;

    @Before
    public void setup() {
        testPersonOne = new Person(26, "Cody", "Toledo");
        testPersonTwo = new Person(25, "Claire", "Los Angeles");

        testCellOne = new CellPhone(testPersonOne, testPersonOne.getLastKnownAddress());
        testCellTwo = new CellPhone(testPersonTwo, testPersonTwo.getLastKnownAddress());

        testCallOne = new Call(testCellTwo, testCellTwo.getLocation());
        testCallTwo = new Call(testCellOne, testCellOne.getLocation());
    }

    @Test
    public void testCellPhoneGetLocation() {
        assertEquals(testCellOne.getLocation(), testPersonOne.getLocation());
    }

    @Test
    public void getCallHistory() {
        testCellOne.addCall(testCallOne);
        assertTrue(testCellOne.getCallHistory().contains(testCallOne));
        testCellOne.addCall(testCallTwo);
        assertEquals(testCellOne.getCallHistory().size(),2);
    }
}
