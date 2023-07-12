/*Implement a phonebook using a map, where the keys are names
and the values are phone numbers. Provide operations to add a contact,
remove a contact, and retrieve a phone number given a name.*/
package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook
{
    public Map<String,String> contacts;

    public PhoneBook()
    {
        contacts=new HashMap<>();
    }

    public void addContacts(String name, String phone)
    {
        contacts.put(name,phone);
    }
    public void removeContacts(String name)
    {
        contacts.remove(name);
    }

    public String getPhoneNumber(String name)
    {
        return contacts.get(name);
    }

    public static void main(String[] args)
    {
        PhoneBook pb = new PhoneBook();
        pb.addContacts("Shiv","1234567890");
        pb.addContacts("Police","100");
        pb.addContacts("ambulance","112");

        System.out.println(pb.contacts);
        pb.removeContacts("Shiv");
        System.out.println(pb.contacts);
        String phone= pb.getPhoneNumber("ambulance");
        System.out.println(phone);
    }
}
