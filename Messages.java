//Messages.java
//This is an instantiable class to create a message object

import java.io.*;
import java.util.*;

public class Messages implements Serializable
{
	private String text;
	
	// 'accessor' methods to return a copy of an attribute
	public String getText() {return text;}
	
	// 'mutator' methods to change the value of an attribute
	public void setText(String text)
	{
		this.text=text;
	}
	
	// 'constructor' methods to give contacts an initial state
	
	/** full-args constructor, to create a contact 
	 */
	 
	 public Messages(String text)
	 {
	 	setText(text);
	 }
	 
	 /** no-args constructor, for use as in Messages c = new Messages()
	 *  to create a default Message
	 */
	 
	 public Messages()
	 {
	 	this("No Text");
	 }
	 
	 //toString method
	 public String toString()
	 {
	 	return getText();
	 }
	
	
	
}