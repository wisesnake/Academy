package chpt18ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex7 {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\Administrator\\eclipse-workspace\\basic\\src\\basic\\Varible1.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData = "";
		while(true) {
			rowData = br.readLine();
			System.out.println(rowNumber++ + ": " + rowData);
			if(br.readLine() == null) break;
		}
		fr.close();
		br.close();
	}

}
