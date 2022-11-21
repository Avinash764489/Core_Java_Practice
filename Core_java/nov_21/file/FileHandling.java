package file;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String arg[]) throws IOException {
		
		File obj = new File("D://test.txt");
		boolean result = obj.createNewFile();
		if(result) {
			System.out.println("successfull");
		}else {
			System.out.println("Not creared");
		}
	}
}
