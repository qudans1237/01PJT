package jp02.part01;

import java.util.*;

/*
*	FileName : RandomTest.java 
*	::: 임의의 수 Object Modeling 한 java.util.Random  
*/
public class RandomTest {
	
	///Main Method
	public static void main(String args[]) {
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println("0 ~ 100 범위의 임의 숫자는 " + i);
		
		i = random.nextInt(1000);
		System.out.println("0 ~ 1000 범위의 임의 숫자는 " + i);		
		
		//Random r01 = new Random()
		//float f = r01.nextFloat();
		//System.out.println("임의 숫자는 " + r01.nextFloat());
		System.out.println("임의 숫자는 " + new Random().nextFloat());
		
   }//end of main
	
}//end of class