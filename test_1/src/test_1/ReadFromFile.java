package test_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {
		
		File file1 = new File("textfile.txt");
		File file2 = new File("textfile2.txt");
		
		BufferedReader bufferedReader;
		
		String line;
		
		try {
			// create a new BufferedReader object, using FileReader object
			bufferedReader = new BufferedReader(new FileReader(file1));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*************************************************");
		try {
			bufferedReader = new BufferedReader(new FileReader(file2));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
