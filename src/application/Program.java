package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String path = sc.nextLine();
		
		File f = new File(path);
		File[] folders = f.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File fold : folders) {
			System.out.println(fold);
		}
		File[] fl = f.listFiles(File::isFile);
		System.out.println("FILES");
		for(File file : fl) {
			System.out.println(file);
		}
		
		boolean success = new File(path + "\\subdir").mkdir();
		System.out.println("Created a directory sucessfull!");
		
	}

}
