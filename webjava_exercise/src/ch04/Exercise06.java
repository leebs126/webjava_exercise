package ch04;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		int totalDistance = 0 ;
		double totalFeets = 0.0;
		double average = 0.0;
		String temp = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요일별 운동거리를 입력해 주세요.");
		System.out.print("월: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("화: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("수: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("목: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("금: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("토: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.print("일: ");
		temp = sc.nextLine();
		totalDistance += Integer.parseInt(temp);
		
		System.out.println("총 운동거리: " + totalDistance +"km");
		
		totalFeets = totalDistance / 0.3048;
		average = totalFeets / 7;
		
		System.out.println("평균운동 거리: " + average + "feets");
		System.out.printf("평균운동 거리: %.2f feets",  average);
				
		sc.close();
		
		
		
		

	}

}
