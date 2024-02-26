package ch04;

import java.util.Scanner;

//임의의 세 자릿수 정수를 입력받아서,
//각 자리의 수들이 서로 일치하는지 판별하는 코드를 작성해 보세요.
/*
123

1.각 자리의 수를 얻습니다.
2.각각의 자리수가 같은지 비교연산자로 비교합니다.
3. 세 개의 정수가 같으면 같다는 결과를 출력합니다.

 
 
 
 */
public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 자리 정수를 입력하세요.");
		String temp = sc.nextLine();
		int num = Integer.parseInt(temp);
		int originNum = num;
		
		int digit100 = 0, digit10 = 0, digit1 = 0;
		
		//1. 정수의 각 자리수를 얻습니다.
		digit1 = num % 10;
		num /=10;
		
		digit10 = num % 10;
		num /=10;
		
		digit100 = num;
		
		
		//2. 각각의 자리수를 비교합니다.
		boolean sameDigit1 = (digit100==digit10);
//		System.out.println("sameDigit1: " + sameDigit1);
		
		boolean sameDigit2 = (digit10 == digit1);
//		System.out.println("sameDigit2: " + sameDigit2);
		
		boolean result = ((sameDigit1 == true) && (sameDigit2 == true));
		
		String message = (result == true) ? "세 개의 자리수가 같습니다." : "세 개의 자리수가 다릅니다."; 
		
		System.out.println("입력한 수: " + originNum +", 결과: " + message);
		
		sc.close();
	}

}