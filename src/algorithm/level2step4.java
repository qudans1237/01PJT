package algorithm;

public class level2step4 {
	public static void main(String[] args) {
		int x = 1, y = -1;

//		if(-1000 <= x && x<=1000 && x!=0) {
//			if(-1000<= y && y<= 1000 && y!=0) {
//				if (x>0 && y>0) {
//					System.out.println("제 1 사분면");
//				}else if(x>0 && y<0) {
//					System.out.println("제 4 사분면");
//				}else if(x<0 && y >0) {
//					System.out.println("제 2 사분면");
//				}else {
//					System.out.println("제 3 사분면");
//				}
//			}

		if ((-1000 <= x && x <= 1000 && x != 0) && (-1000 <= y && y <= 1000 && y != 0)) {
			if (x > 0 && y > 0) {
				System.out.println("제 1 사분면");
			} else if (x > 0 && y < 0) {
				System.out.println("제 4 사분면");
			} else if (x < 0 && y > 0) {
				System.out.println("제 2 사분면");
			} else {
				System.out.println("제 3 사분면");
			}
		}
	}
}