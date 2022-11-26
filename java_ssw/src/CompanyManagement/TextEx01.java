package CompanyManagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;

public class TextEx01 {

	public static void main(String[] args) {
		
		ArrayList<TestEx02> list = new ArrayList<TestEx02> ();
		String name = "신선우";
		int num = 3;
		TestEx02 test = new TestEx02(name, num);
		try {
			//
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write(test.getName().toString());
			bw.newLine();
			bw.write(Integer.toString(num));
//			bw.newLine();	//라인 엔터
//			bw.write("hi");
			bw.close();
			
			System.out.println("확인");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
