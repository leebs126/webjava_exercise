package ch08.ex11;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp = null;
		PrimeUtil p = new PrimeUtil();
		
		
		System.out.println("정수를 입력하세요");
		temp = sc.nextLine();
		int num1 = Integer.parseInt(temp);
		int total1 = p.calcPrime(num1);
		System.out.println("소수합: " + total1);
		
		
		System.out.println("\n두 정수를 입력하세요");
		temp = sc.nextLine();
		int num2 = Integer.parseInt(temp);
		
		temp = sc.nextLine();
		int num3 = Integer.parseInt(temp);
		int total2 = p.calcPrime(num2, num3);
		System.out.println("두소수합: " + total2);
	}

}
