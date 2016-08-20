package com.hand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class App 
{
    

	public static void main( String[] args )
    {
      URL url = null;
	try {
		url = new URL("http://files.saas.hand-china.com/java/target.pdf");
	} catch (MalformedURLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	   URLConnection connection = null;
	try {
		connection = url.openConnection();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	InputStream is = null;
	try {
		is = connection.getInputStream();
		
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	InputStreamReader isr=new InputStreamReader(is);
	BufferedReader br=new BufferedReader(isr);
	String line;
	byte[] buffer = new byte[1204];
	
	try {
		FileOutputStream fs = new FileOutputStream("d:/target.txt");
		while((line=br.readLine())!=null){
			System.out.println(line);

			fs.write(buffer);
		
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		br.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		isr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		is.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
	
	
}
