package test;

import java.util.Scanner;
public class Prob03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("1보다 크고 10보다 작은 정수를 입력하세요: ");
        int inputInt = keyboard.nextInt();

        int sum = 1; 
        for(int i = 1; i <= inputInt ;i++) { 
            if(inputInt < 2 || inputInt > 9) { 
                System.out.print("잘못된 숫자가 입력되었습니다."); 
                break; 
            }//end of if
            sum = sum * i; 
            System.out.println(i + "! = " + sum); 
        }//end of for
    }//end of main
}//end of class