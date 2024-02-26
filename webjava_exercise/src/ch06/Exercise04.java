package ch06;

import java.util.Arrays;

public class Exercise04 {

	public static void main(String[] args) {
		int[] arrNum = new int[10];
		
		int randNum = 0; 
		
		boolean isExisted = false;
		
		int idx = 0; 
		while(true) {
			randNum = (int)(Math.random() * 100) + 1;  //1에서 100사이의 자연수를 구한다.
			
			for(int i = 0; i < arrNum.length; i++) {  //기존의 배열에 값이 존재하는지 판별한다.
				if(arrNum[i] == randNum) {
					isExisted = true;
					break;
				}
			} //end for
			
			if(isExisted == true) {  //값이 존재하면 다시 while문의 처음으로 이동한다.
				isExisted = false;
				continue;   
			}
			
			arrNum[idx] = randNum;     			//값이 존재하지 않으면 배열에 저장 후 인덱스를 1증가시킨후 계속 한다.
//			System.out.println(arrNum[idx] +", idx= " + idx);
			idx++;
			if(idx == 10) break;
		}
		
		//오름 차순으로 정렬 전
		System.out.println(Arrays.toString(arrNum));
		
		//배열값들을 오름 차순으로 정렬
		for(int i = 0; i < arrNum.length; i++) {
			for(int j = i; j < arrNum.length; j++) {
				if(arrNum[i] >= arrNum[j]) {
					int temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
		
		//오름 차순으로 정렬 후
		System.out.println(Arrays.toString(arrNum));
		
		
		

	}

}
