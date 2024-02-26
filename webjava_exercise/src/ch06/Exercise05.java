package ch06;

import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		int[] num1 = {34, 56, 78, 7, 23, 46, 43, 55};
		int[] num2 = {12, 34, 2, 99, 18};
		int temp = 0;
		int[] arrNum = new int[num1.length + num2.length];
		
		//arrNum에 각각의 배열 값을 저장합니다.
		for(int i = 0; i < num1.length; i++) {
			arrNum[i] = num1[i];
		}
		
		for(int i = 0; i< num2.length; i++) {
			arrNum[num1.length + i] = num2[i];
		}
		
		System.out.println("정렬전");
		System.out.println(Arrays.toString(arrNum));
		
		//버블 정렬
		for(int i = 0; i < arrNum.length; i++) {
			for(int j = i; j < arrNum.length; j++) {
				if(arrNum[i] > arrNum[j]) {
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}

		System.out.println("정렬후");
		System.out.println(Arrays.toString(arrNum));
	}
}
