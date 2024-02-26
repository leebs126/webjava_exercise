package ch07;

public class Exercise04 {

	public static void main(String[] args) {
		int[] score1 = {45, 67, 78, 89, 91};
		int[]score2 = {62, 65, 76, 77, 88};
		double avg = 0.0;
		
		Exercise04 m = new Exercise04();
		avg = m.average(score1);
		System.out.println("시험 평균: " + avg);
		
		avg = m.average(score2);
		System.out.println("시험 평균: " + avg);

	}
	
	
	public double average(int[] arr){
		double average = 0d;
		int total = 0;
		//이곳에 작성해 주세요.
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		average = (double)total / arr.length;
		
		
		return average;
	}

}
