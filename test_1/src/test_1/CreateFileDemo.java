package test_1;

import java.io.File;
import java.io.IOException;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class CreateFileDemo {
	public static void main(String[] args) throws IOException {
		
		/* The parameter for creating a new File object 
		 * can be absolute address and relative address
		 */
		// using relative path here
		File newFile = new File("textfile.txt");
		
		System.out.println("****************************************");
		System.out.println(newFile.getAbsolutePath());
		System.out.println(newFile.getCanonicalPath());
		System.out.println(newFile.getPath());
		System.out.println("****************************************");
		
		
		try {
			
			if (newFile.createNewFile()) {
				System.out.println(newFile.getAbsolutePath() 
						+ " successfully created.");
			}
			else{
				System.out.println(newFile.getAbsolutePath()
						+ " already existed.");
			}
			
		} catch (IOException e) {
			System.out.println("Can not create new file, "
					+ "because there is IOException");
			e.printStackTrace();
		}
		
		// using absolute path here 
		File newFile2 = new File("/Users/jianheluo/Desktop/"
				+ "tutorial code/Java IO tutorial/test_1/textfile2.txt");
		
		System.out.println("****************************************");
		System.out.println(newFile2.getAbsolutePath());
		System.out.println(newFile2.getCanonicalPath());
		System.out.println(newFile2.getPath());
		System.out.println("****************************************");
		
		
		try {
			
			if (newFile2.createNewFile()) {
				System.out.println(newFile2.getPath()
						+ " successfully created.");
			}
			else{
				System.out.println(newFile2.getPath()
						+ " already existed.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
