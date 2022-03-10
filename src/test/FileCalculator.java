package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

public class FileCalculator {

	public void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		
		Vector<String> vc = new Vector<String>(10,10);
		String read = "";
		int sum = 0;
		int mp = 1;
		while(true) {
			read = br.readLine();
			if(read == null) {
				vc.add(Integer.toString(sum));
				vc.add(Integer.toString(mp));
				break;
			}
			sum += Integer.parseInt(read);
			mp *= Integer.parseInt(read);
			vc.add(read);
		}
		
		BufferedWriter wr = new BufferedWriter(new FileWriter(inputFileName));
		for(int i=0; i<vc.size(); i++) {
			wr.write(vc.elementAt(i));
			wr.newLine();
		}
		wr.flush();
		br.close();
		wr.close();
	}
	
	public static void main(String[] args) throws Exception {
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("D:\\test.dat");

	}

}
