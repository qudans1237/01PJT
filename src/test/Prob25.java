package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Vector;

class Score {
	///Field
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	///Constructor
	public Score() {
		super();
	}
	
	public Score(String name, int kor, int eng, int math, int sum) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}
	
	///Method
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
}

public class Prob25 {
	
	//public Vector getScore(String fileName) throws Exception {
	public List getScore(String fileName)  {
		Vector vc = new Vector();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
		String read = "";
		String[] strTemp;
		int sum = 0;
		while(true) {
			read = br.readLine();
			if(read == null) {
				break;
			}
			strTemp = read.split("/");
			for(int i=1; i<strTemp.length; i++) {
				sum += Integer.parseInt(strTemp[i]);
			}
			Score sc = new Score(strTemp[0],Integer.parseInt(strTemp[1]),
					Integer.parseInt(strTemp[2]),Integer.parseInt(strTemp[3]), sum);
			vc.add(sc);
			sum = 0;
		}
		}catch(Exception e) {
			
			
		}finally {
			
			if(br != null) {
				try { br.close(); } catch(Exception e1){}
				}
			}
		
	
		return vc;
	}
	
	public static void main(String[] args) throws Exception {
		Prob25 p2 = new Prob25();
		//Vector scores = p2.getScore("src/data.txt");
		List scores = p2.getScore("src/data.txt");
		for(int i=0; i<scores.size(); i++) {
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+" : "
					+score.getKor()+" "+score.getEng()+" "
					+score.getMath()+" "+score.getSum());
		}

	}
}
