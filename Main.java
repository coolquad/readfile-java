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
// 		File inFile = new File("C:\\Users\\erikI\\downloads\\doc.txt");
// 		List<Integer> list=new ArrayList<Integer>(); //declaring a list
//         InputStream ins = null; // raw byte-stream
//         Reader r = null; // cooked reader
//         BufferedReader br = null; // buffered for readLine()
//         try {
//             String s;
//             ins = new FileInputStream(inFile);
//             r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
//             br = new BufferedReader(r);
//             while ((s = br.readLine()) != null) {
//               list.add(Integer.parseInt(s));
//             }
//         }
//         catch (Exception e)
//         {
//           System.err.println(e.getMessage()); // handle exception
//         }
        
//         System.out.println(ins);
//         Path currentRelativePath = Paths.get("");
// String ss = currentRelativePath.toAbsolutePath().toString();
// System.out.println("Current relative path is: " + ss);
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
