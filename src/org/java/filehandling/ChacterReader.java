package org.java.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ChacterReader {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\sony\\Desktop\\myself.txt")));
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			
		}
	
	}

}
