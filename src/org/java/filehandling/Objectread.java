package org.java.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

public class Objectread {

	public static void main(String[] args) throws IOException,NotSerializableException{
		ObjectInputStream in=null;
		try{
			in=new ObjectInputStream(new BufferedInputStream(new FileInputStream("sandeep")));
			object ob=(object)in.readObject();
			System.out.println(ob.getName());
			System.out.println(ob.getAge());
			System.out.println(ob.getFather());
			System.out.println(ob.getMother());
			System.out.println(ob.toString());
			
			
		}
catch(ClassNotFoundException e){
	}
finally{
}
in.close();}}