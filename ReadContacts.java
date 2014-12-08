//ReadContacts

import java.io.*;
import java.util.*;

public class ReadContacts
{
	public static void main(String args[])
	{
		LinkedList<Contact> contacts = new LinkedList<Contact>();
		
		try{
		
		File contactsFile = new File("myContacts.dat");
		
		FileInputStream fis = new FileInputStream(contactsFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		myContacts = (LinkedList <Contact>)ois.readObject();
		}//end try
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}//end catch
		
		for(Contact c1: myContacts)
		{
			System.out.println(c1.toString());
		}
	}
}