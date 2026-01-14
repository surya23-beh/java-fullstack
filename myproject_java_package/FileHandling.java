package myproject_java_package;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			// creation of file 
			File file = new File("D:/example.txt");
			if(file.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File already exist");
			}
			// File writing
			FileWriter fw = new FileWriter("D:/example.txt");
			fw.write("Phone na hello hello tape nakka cello");
			fw.close();
			System.out.println("File written successfully");
			
			// File Reading
			
			FileReader fr = new FileReader("D:/example.txt");
			int ch;
			while( (ch = fr.read())!=-1) {
				System.out.print
				((char) ch);
			}
			fr.close();
			System.out.println();
			
			// File Buffered Reading
			BufferedReader br = new BufferedReader(new FileReader("D:/example.txt"));
			String line;
			while((line = br.readLine())!=null) {
				
				System.out.print(line);
			}
			
			// File Reader Writing
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/example.txt"));
			bw.write("nammala mokka panna paninitu pottum adhunga waste ana fellow");
			bw.close();
			
			System.out.println();
			// Scanner 
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
			sc.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}

}

