package test_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MoveFileDemo {
	public static void main(String[] args) {
		
		File fileOld = new File("file_old.txt");
		File fileDestination = new File("folder1/file_destination.txt");
		
		// write some text to the file_old.txt
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(fileOld));
			// default value for a new String is null
			String line;
			line = "This is the first line of the file_old.txt";
			printWriter.println(line);
			line = "This is the second line, and I will write three lines for this file.";
			printWriter.println(line);
			line = "You are right, I am the third line of this file.";
			printWriter.println(line);
			printWriter.close();
			
			System.out.println("***********************************************");
			System.out.println("The contents for the file_old.txt are followings");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOld));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("***********************************************");
			bufferedReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// move the old file to the new destination.
		try {
			
			/*
			 * 1. read from old file.
			 * 2. write to new destination file.
			 * 3. delete the old file.
			 */
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOld));
			PrintWriter printWriter = new PrintWriter(new FileWriter(fileDestination, false));
			
			// default value for a new String is null
			String line;
			
			while ((line = bufferedReader.readLine()) != null) {
				printWriter.println(line);
			}
			
			bufferedReader.close();
			printWriter.close();
			
			fileOld.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
