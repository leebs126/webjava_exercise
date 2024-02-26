package ch07;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		System.out.println("두 자연수를 입력해 주세요.");
		System.out.print("num1= ");
		String temp1 = sc.nextLine();
		num1 = Integer.parseInt(temp1);
		
		System.out.print("num2= ");
		String temp2 = sc.nextLine();
		num2 = Integer.parseInt(temp2);
		
		Exercise06 m = new Exercise06();
		m.printGCD(num1, num2);
	}
	
	
	public void printGCD(int x, int y) {
		int gcd = 1; // 최대 공약수(great common divisor)
		int min = x;
		
		if(x > y) {
			min = y;
		}
		
		for (int i = 1; i <= min; i++) {
			if (x % i == 0 && y % i == 0) {
				System.out.println(i + "는 " + x + "과 " + y + "의 공약수입니다.");
				
				if (gcd < i) {  //앞에서 구한 공약수보다 i가 크면 최대 공약수를 변경합니다.
					gcd = i;
				}
			}

		}

		System.out.println(x + "과 " + y + "의 최대 공약수 = " + gcd);
		
	}

}
