package jp02.part01;

import java.util.*;

/*
*	FileName : RandomTest.java 
*	::: ������ �� Object Modeling �� java.util.Random  
*/
public class RandomTest {
	
	///Main Method
	public static void main(String args[]) {
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println("0 ~ 100 ������ ���� ���ڴ� " + i);
		
		i = random.nextInt(1000);
		System.out.println("0 ~ 1000 ������ ���� ���ڴ� " + i);		
		
		//Random r01 = new Random()
		//float f = r01.nextFloat();
		//System.out.println("���� ���ڴ� " + r01.nextFloat());
		System.out.println("���� ���ڴ� " + new Random().nextFloat());
		
   }//end of main
	
}//end of class