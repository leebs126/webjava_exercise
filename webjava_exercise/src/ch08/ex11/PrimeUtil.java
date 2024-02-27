package ch08.ex11;

public class PrimeUtil {
	public int calcPrime(int num) {
		int totalPrime = 0;
		int count = 0;
		int x = 2;
		// 기능 구현

		while (x <= num) {
			// 약수의 개수를 구합니다.
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}
			}
			// 소수 여부를 판별합니다.
			if (count == 2) {
				System.out.println(x);
				totalPrime += x;
			}
			
			x++;
			count = 0;
		}

		return totalPrime;
	}

	public int calcPrime(int num1, int num2) {
		// 기능 구현
		int totalPrime = 0;
		int count = 0;
		int x = num1;
		int min = num1, max = num2;
		
		if(num1 > num2) {
			min = num2;
			max = num1;
			x= num2;
		}
		
		// 기능 구현
		while (x <= max) {
			// 약수의 개수를 구합니다.
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}
			
			}
			
			// 소수 여부를 판별합니다.
			if (count == 2) {
				System.out.println(x);
				totalPrime += x;
			}
			x++;
			count = 0;
		}

		return totalPrime;
	}
}
