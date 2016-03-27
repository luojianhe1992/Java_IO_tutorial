package test_1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateDirectories {
	public static void main(String[] args) {
		
		List<File> directories = new ArrayList<File>();
		
		directories.add(new File("folder1"));
		directories.add(new File("folder2"));
		directories.add(new File("folder3"));
		directories.add(new File("folder4"));
		directories.add(new File("folder5"));
		directories.add(new File("folder6"));
		
		System.out.println(directories);
		
		for (File tempFile: directories){
			// using File object to call mkdir function.
			if (tempFile.mkdir()) {
				System.out.println(tempFile.getAbsolutePath() + " created successfully.");
			}
			else{
				System.err.println(tempFile.getAbsolutePath() + " already existd.");
			}
		}

		
	}
}
