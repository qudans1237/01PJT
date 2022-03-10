package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.EmptyStackException;
import java.util.Stack;

public class FileController {

	public void reverseLine(String oldf, String newf)throws Exception{
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		BufferedWriter bw = new BufferedWriter(new FileWriter(newf));
		
		Stack<String> st = new Stack<String>();
		
		
		String txt = "";
		
			while(true) {
			txt = br.readLine();
			//System.out.println(txt);
			if(txt == null) {
				break;
			}
			st.push(txt);
			//System.out.println(st.peek());
			
			
		}
		
		
		while(true) {
			
			//System.out.println(st.peek());
			txt = st.pop();
			bw.write(txt);
			bw.newLine();
			bw.flush();
			count++;
			if(txt == null) {
				break;
			}
			
			
		}
		
		//resverLine �޼ҵ�
		br.close();
		bw.close();
	}
	
	
	public static void main(String[] args)throws Exception  {
		
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		try {
		c.reverseLine(oldf,newf);
		}catch(EmptyStackException e1) {
			e1.printStackTrace();
		}
	}

}
