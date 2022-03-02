package test;

import java.util.Vector;

public class  ArrayCopy
{
	public Vector<String> moveToVector(String[] datas) {
		Vector<String> v = new Vector<String>(datas.length);
		
		for(int i = datas.length-1; i >= 0; i--) {
			v.add(datas[i]);
		} 

		return v;
	}

	public static void main(String[] args) 
	{
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1", "2", "3", "4", "5"};
		System.out.println(ac.moveToVector(datas));
	}
}
