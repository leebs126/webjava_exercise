package ch05;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		int num = 0, i = 0;
		int total = 0;

		while(true) {
			total += num;
			
			if(total >= 1000)  break;
			
			i++;
			if(i % 2 == 0) {
				num = -i;
			}else {
				num = i;
			}
			System.out.println(num);
		} //end while
		
		System.out.println("num : " + num +", total: " +total);
	}
}
