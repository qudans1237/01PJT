package jp03.part04;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String args[]) throws Exception{
		
		int readCount=0;
		
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
//		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		// filter Stream : SInk Stream을 통해 들어온 Data 조작
		
		
		
		String oneLine=null;
		
		while(true) {
			readCount++;
			
			oneLine = br.readLine(); // 효율적으로 불러올수 있다.
			if(oneLine==null) {
				break;
			}
			
			System.out.println("한줄출력: "+readCount+" "+oneLine);
		}
		
		br.close();
		//fr.close();
	}
}
