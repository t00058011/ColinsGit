/**This is an instantiable Contact class.
 @author Colin Curran
 @version 1.0 */ 


import java.io.*;
import java.util.*;

public class Contact implements Serializable
{
	//attributes
	private String name;
	private String number;
	
	/** accessor method to return the student name
	 *@return the name of the student */

	public String getName() {return name;}
	public String getNumber() {return number;}
	
	/** mutator method to set the student name
	 *@param name the name of the student */

	public void setName(String name)
	{
		this.name=name;
	}
	public void setNumber(String number)
	{
		this.number=number;
	}
	
	
	
	
	/** Two-args constructor, to create a contact 
	 @param name and number of contact */
	 
	 public Contact(String name,String number)
	 {
	 	setName(name);
	 	setNumber(number);
	 }
	 
	/** no argument constructor method
	 @param name the default details of the contact */

	 
	 public Contact()
	 {
	 	this("Not Givin","0");
	 }
	 
	 /** toString method to return the contact details
	 *@return the name and number of the contact as a string */

	 public String toString()
	 {
	 	return getName() + "\n" + getNumber();
	 }
	
	
	
}//end class