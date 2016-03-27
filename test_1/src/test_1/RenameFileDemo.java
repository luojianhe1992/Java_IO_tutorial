package test_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RenameFileDemo {
	public static void main(String[] args) {
		File fileBeforeRename = new File("file_before_rename.txt");
		File fileAfterRename = new File("folder3/file_after_rename.txt");
		
		// try to write some text to the file_before_name.txt at first.
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(fileBeforeRename));
			String line;
			line = "This is the first line to be in the file.";
			printWriter.println(line);
			line = "This is 2nd line.";
			printWriter.println(line);
			line = "Wow, this is the 3rd line, cool.";
			printWriter.println(line);
			
			printWriter.close();
			
			System.out.println("*****************************************************");
			System.out.println("Followings are the contents from file_before_rename.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileBeforeRename));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("*****************************************************");
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		// try rename the file.
		try {
			if (fileBeforeRename.renameTo(fileAfterRename)) {
				System.out.println(fileBeforeRename.getAbsolutePath() + " rename successfully.");
				
				System.out.println();

				System.out.println("Print out the content of the file_after_rename.txt");
				BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAfterRename));
				String line;
				System.out.println("*****************************************************");
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println("*****************************************************");
				bufferedReader.close();
			}
			else{
				System.out.println(fileBeforeRename.getAbsolutePath() + " can not be renamed.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
