package ch05;

public class Exercise01 {

	public static void main(String[] args) {
		int rowNum = 5;
		int starNum = 4;
		
		//행이 증가하면 별수를 증가시킵니다.
		for(int i = 1; i < rowNum; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//행이 증가하면 별수를 감소시킵니다.
		for(int i = 1; i < rowNum; i++) {
			for(int j = 0; j < starNum - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
