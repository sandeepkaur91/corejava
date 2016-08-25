package org.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream outfile = null ;
		try {
		 in= new FileInputStream("person.txt");
			 outfile = new FileOutputStream("output.txt");
			int c;
			while((c=in.read()) !=-1){
				outfile.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in!=null){
				in.close();
			}
			if(outfile!=null){
				outfile.close();
			}
		}

	}

}
