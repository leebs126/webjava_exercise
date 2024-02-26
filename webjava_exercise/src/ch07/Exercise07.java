package ch07;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = 0;

		System.out.println("소수 순서를 입력하세요.");
		System.out.print("order: ");
		String temp = sc.nextLine();
		order = Integer.parseInt(temp);
		
		Exercise07 m = new Exercise07();
		m.printPrimeNumberOrder(order);

	}

	public void printPrimeNumberOrder(int order) {
		int primeOrder = 0;
		int count = 0;
		int x = 2;

		while(true) {
			//약수의 개수를 구합니다.
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}
			}

			// 소수 여부를 판별합니다.
			if (count == 2) {
				primeOrder++;
			}
			
			if(primeOrder == order) break;
			x++;
			count = 0;
			
		} //end while
		
		System.out.println(order+"번째 소수: " + x);
	}

}
