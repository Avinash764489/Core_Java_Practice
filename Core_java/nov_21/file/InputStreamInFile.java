package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamInFile {

	public static void main(String arg[]) throws IOException {
		
		byte [] bt = new byte[100];
		
		InputStream obj = new FileInputStream("D://test.txt");
		
		System.out.println("Number of character in file : "+obj.available());
		
		obj.read(bt);
		
		System.out.println(bt);
		
		String str = new String(bt);
		System.out.println(str);
		
		obj.mark(5);
		String str2 = new String(bt);
		System.out.println(str2);
	}
}
