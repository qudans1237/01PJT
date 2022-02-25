package test;

import java.util.Scanner;
public class Prob01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1보다 크고 10보다 작은 정수를 입력하세요: ");
        int inputInt = keyboard.nextInt();

        //validation check first
        if(0 < inputInt && inputInt < 10){
            int m = 1;
            
            while(m < 10){
				int result = inputInt * m;
                System.out.println(inputInt + " * " + m + " = " + result);
                m++;
            }
        }else{
            System.out.println("잘못된 숫자가 입력되었습니다.");
        }
    }
}