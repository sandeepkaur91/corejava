package org.java.socketprogramming;

import java.io.IOException;
import java.net.URL;

public class Parseurl {

	public static void main(String[] args) throws Exception{
	
	
		URL aUrl=new URL("http://www.google.com//networking//doc");
		System.out.println("authority="+ aUrl.getAuthority());
         System.out.println("protocol="+ aUrl.getProtocol());
         System.out.println("host="+ aUrl.getHost());
         System.out.println("path="+aUrl.getPath());
         
	}

}
