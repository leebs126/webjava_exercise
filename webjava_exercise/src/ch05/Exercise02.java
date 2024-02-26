package ch05;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		int num = 0;
		
		System.out.println("양의 정수를 입력해 주세요.");
		String temp = sc.nextLine();
		num = Integer.parseInt(temp);
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				System.out.println("5월 배수: " + i);
			}
		}
	}

}
