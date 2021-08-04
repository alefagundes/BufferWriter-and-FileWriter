package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good night"};
		
		String path = "C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String cacatua : lines) {
				bw.write(cacatua);
				bw.newLine();
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
