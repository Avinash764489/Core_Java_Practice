package file;

import java.io.File;
import java.io.IOException;

public class DeleteFile {


	public static void main(String arg[]) throws IOException {
		 
		File obj = new File("D://tast.txt");
		boolean result = obj.delete();
		if(result)
			System.out.println("deleted");
		
	}
}
