 package jp02.part01;

import java.io.*;

public class WriterTest{

	public static void main(String[] args){

		InputStream inputStream=System.in;
		Reader reader=new InputStreamReader(inputStream);
		OutputStream outputStream=System.out;
		Writer writer=new OutputStreamWriter(outputStream);

		System.out.println("입력을 기다립니다");
		try{
			while(true){

				int i=reader.read();
				writer.write(i);
				writer.flush();

				if((char)i=='x'){
					break;
				}
			}

			reader.close();
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
