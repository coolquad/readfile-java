/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.*; 
import java.util.function.Supplier; 
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main
{
	public static void main(String[] args) {
		System.out.println("D:\\doc.txt");
	ArrayList<String> list = new ArrayList<String>();
	try{
	    Scanner s = new Scanner(new File("D:\\doc.txt"));          
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
	}catch(Exception e){
	    System.err.println(e.getMessage());
	}        
	System.out.println(list);
	}
}
