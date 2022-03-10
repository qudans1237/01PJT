package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {
	
	
	//public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception{
	public List compareFile(String fstFileName, String scdFileName) throws Exception{

		//implements compareFile method.
		BufferedReader br1 = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));
		ArrayList ar = new ArrayList();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		String str1 = "";
		String str2 = "";
		while(true) {
			count++;
			str1 = br1.readLine();
			str2 = br2.readLine();
			if(str1 == null && str2 == null) {
				break;
			}
			if(!str1.equals(str2)) {
				ar.add("LINE "+count+"::"+str2);
			}
			
		}
		br1.close();
		br2.close();
		return ar;
	
	}
	
	public static void main(String[] args) throws Exception  {
		
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("./files/fstFile1.txt", "./files/scdFile1.txt"));
		System.out.println("Successfull!!");
		
	}
}
