package jp01.part06;

import java.util.Vector;

public class VectorTest02 extends Vector {

//	public VectorTest02() {
//		super();
//	}

	public VectorTest02(int initialCapacity, int capacityIncrement) {
		super(initialCapacity, capacityIncrement);
	}

	public void printString(Vector vector) {
//		for(int i=0;i<vector.size();i++){
//		 System.out.print((String)vector.elementAt(i));//명시적 형변환
//		}
	
		for(Object object : vector) {
			System.out.print((String) object); // 명시적 형변환
		}
	
	}

	public static void main(String[] args) {
		VectorTest02 vectorTest = new VectorTest02(10, 10);
		String s1 = new String("1.홍");
		vectorTest.add(s1);// 묵시적 형변
		vectorTest.add(new String("2.동"));
		vectorTest.add("3.님 안녕하세요");
		vectorTest.printString(vectorTest);

		System.out.println("\n ==> API확인");
		vectorTest.insertElementAt("4.길", 1);
		vectorTest.printString(vectorTest);

		System.out.println("\n ==> API확인");
		vectorTest.setElementAt("5.홍길순", 3);
		vectorTest.printString(vectorTest);

		System.out.println("\n ==> API확인");
		vectorTest.removeElementAt(3);
		vectorTest.printString(vectorTest);
	}
}
