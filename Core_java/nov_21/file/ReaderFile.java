package file;

import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {

	public static void main(String arg[]) throws IOException {
		 
		FileReader obj = new FileReader("D://test.txt");
		
		char[] str = new char[100];
		obj.read(str);
		System.out.println(str);
	}
}
