package ch06;

public class Exercise06 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "이순신", "임꺽정"};
		int[][] score = {{89, 77, 90},
						 {67, 87, 66},
						 {66, 77, 88}
						};
		
		int[] arrTotal = {0, 0, 0};
		double[] arrAverage = {0.0, 0.0, 0.0};
		
		for(int i = 0; i < arrTotal.length; i++) {
			for(int j = 0; j < arrTotal.length; j++) {
				arrTotal[i] += score[i][j];
			}
			
			arrAverage[i] = (double)arrTotal[i] / arrTotal.length;
		}
		
		System.out.println("-------------------------");
		System.out.print("이름 \t 총점 \t 평균\n");
		System.out.println("-------------------------");
		for(int i = 0; i < arrTotal.length; i++) {
			System.out.printf("%s \t %d \t %.1f \n", name[i], arrTotal[i], arrAverage[i]);
		}

	}

}
