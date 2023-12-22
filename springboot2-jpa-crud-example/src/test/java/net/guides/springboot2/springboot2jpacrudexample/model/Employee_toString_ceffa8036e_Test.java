/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Test Scenario 1: Validate the format of the output string
- Description: The function should return a string in the format of "Employee [id=ID, firstName=FIRSTNAME, lastName=LASTNAME, emailId=EMAILID]". 

Test Scenario 2: Validate the correct values are displayed in the output string
- Description: The function should correctly display the values of id, firstName, lastName, and emailId in the output string.

Test Scenario 3: Validate the output when the fields are null
- Description: The function should correctly handle and display null values for id, firstName, lastName, and emailId.

Test Scenario 4: Validate the output when the fields contain special characters
- Description: The function should correctly handle and display special characters in the values for id, firstName, lastName, and emailId.

Test Scenario 5: Validate the output when the fields contain whitespace
- Description: The function should correctly handle and display whitespace in the values for id, firstName, lastName, and emailId.

Test Scenario 6: Validate the output when the fields contain long strings
- Description: The function should correctly handle and display long strings in the values for id, firstName, lastName, and emailId.

Test Scenario 7: Validate the output when the fields contain numbers
- Description: The function should correctly handle and display numbers in the values for id, firstName, lastName, and emailId.
*/
package net.guides.springboot2.springboot2jpacrudexample.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Employee_toString_ceffa8036e_Test {

    @Test
    public void testToStringFormat() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmailId("john.doe@example.com");

        String expected = "Employee [id=1, firstName=John, lastName=Doe, emailId=john.doe@example.com]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithNullValues() {
        Employee employee = new Employee();
        employee.setId(0);
        employee.setFirstName(null);
        employee.setLastName(null);
        employee.setEmailId(null);

        String expected = "Employee [id=0, firstName=null, lastName=null, emailId=null]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithSpecialCharacters() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("@John$");
        employee.setLastName("#Doe%");
        employee.setEmailId("&john.doe*@example.com");

        String expected = "Employee [id=1, firstName=@John$, lastName=#Doe%, emailId=&john.doe*@example.com]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithWhitespace() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John ");
        employee.setLastName(" Doe");
        employee.setEmailId(" john.doe@example.com ");

        String expected = "Employee [id=1, firstName=John , lastName= Doe, emailId= john.doe@example.com ]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithLongStrings() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("JohnJohnJohnJohnJohnJohnJohnJohnJohnJohn");
        employee.setLastName("DoeDoeDoeDoeDoeDoeDoeDoeDoeDoe");
        employee.setEmailId("john.doe@example.comjohn.doe@example.comjohn.doe@example.com");

        String expected = "Employee [id=1, firstName=JohnJohnJohnJohnJohnJohnJohnJohnJohnJohn, lastName=DoeDoeDoeDoeDoeDoeDoeDoeDoeDoe, emailId=john.doe@example.comjohn.doe@example.comjohn.doe@example.com]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWithNumbers() {
        Employee employee = new Employee();
        employee.setId(1234567890);
        employee.setFirstName("John123");
        employee.setLastName("Doe456");
        employee.setEmailId("john.doe789@example.com");

        String expected = "Employee [id=1234567890, firstName=John123, lastName=Doe456, emailId=john.doe789@example.com]";
        String actual = employee.toString();

        assertEquals(expected, actual);
    }
}
