package jp03.part02;

import java.io.*;

public class WriterTest {
	public static void main(String[] args) {
		
		try{
//			InputStream inputStream = System.in;
			
			Reader reader = new InputStreamReader(System.in);
			
//			OutputStream outputStream = System.out;
			
			Writer writer = new OutputStreamWriter(System.out);
			
			
			
			System.out.println("입력을 기다립니다...");
			
			while(true) {
				int i = reader.read();
				writer.write(i);
				writer.flush();
				
				if((char)i =='x') {
					break;
				}
			}
//			writer.flush();
			// while {} 안에 flush()를 주석처리하면 write.write(I)가 buffer에 쌓이고 
			// flush 는 쌓인 버퍼를 쏴주는 역활
			
			reader.close();
			writer.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
