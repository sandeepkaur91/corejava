package org.java.socketprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Urlreader {

	public static void main(String[] args) throws Exception{
		URL aUrl=new URL("http://luv2trip.com");
BufferedReader sande=new BufferedReader(new InputStreamReader( aUrl.openStream()));
String inputline;
while((inputline =sande.readLine())!=null){
	System.out.println(inputline);
	
}
	sande.close();
	}

}
