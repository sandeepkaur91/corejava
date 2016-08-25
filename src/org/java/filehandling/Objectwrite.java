package org.java.filehandling;
import java. io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java. io.IOException;
import java. io.EOFException;
import java.io. NotSerializableException;





public class Objectwrite {

	public static void main(String[] args) throws IOException,NotSerializableException 
	{
		ObjectOutputStream out=null;
try{
	out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("sandeep")));
	object ob=new object("sandeep",24,"amandeep","kuljeet");
	out.writeObject(ob);
	
}
finally{
	out.close();
}
	}

}
