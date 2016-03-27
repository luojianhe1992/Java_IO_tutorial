package test_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
	public static void main(String[] args) {
		
		File file1 = new File("textfile.txt");
		
		String string1 = "I am going to write to text file.";
		char[] charArray = "I am a char array and I also going to write to text file.".toCharArray();
		
		try {
			// create a PrintWriter object, using FileWriter object
			PrintWriter printWriter = new PrintWriter(new FileWriter(file1));
			
			printWriter.println(string1);
			printWriter.println(charArray);

			printWriter.close();
			
			System.out.println("file1 completed.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("*************************************************");
		
		File file2 = new File("textfile2.txt");
		
		try {
			// set true parameter, that means it will append the string to the file.
			PrintWriter printWriter = new PrintWriter(new FileWriter(file2, true));
			
			printWriter.println(string1);
			printWriter.println(charArray);
			
			printWriter.close();
			
			System.out.println("file2 completed.");

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
