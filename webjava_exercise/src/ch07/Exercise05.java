package ch07;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("양의 정수: ");
		String temp = sc.nextLine();
		num = Integer.parseInt(temp);
		
		Exercise05 m = new Exercise05();
		m.printSameDigit(num);
		

	}
	
	
	public void printSameDigit(int num) {
		int digit1 = 0, digit2 = 0;
		
		for(int i = 10; i <= num; i++) {
			int temp  = i;
			
			//정수의 1의 자리수를 미리 구한 후 while문을 돌면서 다른 자리의 수를 가지고 와서 1의 자리수와 비교합니다.
			digit1 = temp % 10;  //1의 자리수
			while(true) {
				temp /= 10;
				if(temp == 0) {  //temp의 값이 0이면 모든 자리수를 비교했으므로 해당수를 출력합니다.
					System.out.println(i);
				}
				digit2 = temp % 10;  //10의 자리수
				if(digit1 != digit2) break;
				
			} //end while
		}  //end for
		
	}

}

