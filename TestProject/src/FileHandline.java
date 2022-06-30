import java.io.*;

public class FileHandline {

	public static void main(String[] args) throws IOException {
	File f = new File("E:/JavaFile.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		
		
	
	
		
	}

}
