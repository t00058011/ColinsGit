//SaveContact.java

import java.io.*;
import java.util.*;

public class SaveContact
{
	public static void main(String args[])
	{
		LinkedList<Contact> myContacts;
		myContacts = new LinkedList<contact>();
		
		Contact c1 = new Contact("Colin",28);
		Contact c2 = new Contact("Aisling",28);
		
		myContacts.add(c1);
		myContacts.add(c2);
		
		
		/*entryAsString = JOptionPane.showInputDialog("Please enter the new contact number ");
		entry = Integer.parseInt(entryAsString);*/
		
		File contactsFile = new File("myContacts.dat");//where to save the file to
		FileOutputStream fos = new FileOutputStream(contactsFile);
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(myContacts);
		os.close();
		
		
	}
}