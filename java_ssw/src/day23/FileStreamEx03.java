package day23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamEx03 {
	public static void main(String[] args) {
		//기본 형태
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("test.txt");
			fw = new FileWriter("test.txt");
			
			char ch = '\u0000';
			for (int i = 0; i < 200; i++) {
				fw.write(ch++);
			}
			fr = new FileReader("test.txt");
			for (int i = 0; i < 200; i++) {
				int num = fr.read();
				System.out.println((char) num);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
