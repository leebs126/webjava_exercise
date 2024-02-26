package ch05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstMenuNum = 0; 
		int secondMenuNum = 0;
		String temp1 = null;
		String temp2 = null;
		boolean isFinished = false;

		while(true) {
			//1.상위메뉴 출력 후 메뉴번호 입력하기
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1: 회원 2: 렌터카 3: 예약 4: 종료 ");
			System.out.print("메뉴번호 선택: ");
			temp1 = sc.nextLine();
			firstMenuNum = Integer.parseInt(temp1);
//			System.out.println("입력한 메뉴 번호: " + menuNum1);
			System.out.println();
			
			if(firstMenuNum == 1) {
				System.out.println("1: 회원 등록 2:회원조회 3:회원 수정 4: 종료");
				System.out.print("하위 메뉴번호 입력:");
				temp2 = sc.nextLine();
				secondMenuNum = Integer.parseInt(temp2);
				System.out.println("\n------------------------------");
				if(secondMenuNum == 1) {
					System.out.println("회원 등록입니다.");
				}else if(secondMenuNum == 2) {
					System.out.println("회원 조회입니다.");
				}else if(secondMenuNum == 3) {
					System.out.println("회원 수정입니다.");
				}else {
					break;
				}
				System.out.println("------------------------------\n");
			}else if(firstMenuNum == 2) {
				System.out.println("1: 렌터카 등록 2:렌터카 조회 3:렌터카 수정 4: 종료");
				System.out.print("하위 메뉴번호 입력:");
				temp2 = sc.nextLine();
				secondMenuNum = Integer.parseInt(temp2);
				System.out.println("\n------------------------------");
				if(secondMenuNum == 1) {
					System.out.println("렌터카 등록입니다.");
				}else if(secondMenuNum == 2) {
					System.out.println("렌터카 조회입니다.");
				}else if(secondMenuNum == 3) {
					System.out.println("렌터카 수정입니다.");
				}else {
					break;
				}
				System.out.println("------------------------------\n");
			}else if(firstMenuNum == 3) {
				System.out.println("1: 새예약 등록 2:예약 조회 3:예약 수정 4: 종료");
				System.out.print("하위 메뉴번호 입력:");
				temp2 = sc.nextLine();
				secondMenuNum = Integer.parseInt(temp2);
				System.out.println("\n------------------------------");
				if(secondMenuNum == 1) {
					System.out.println("새예약 등록입니다.");
				}else if(secondMenuNum == 2) {
					System.out.println("예약 조회입니다.");
				}else if(secondMenuNum == 3) {
					System.out.println("예약 수정입니다.");
				}else {
					break;
				}
				System.out.println("------------------------------\n");
			}else {
				break;
			}
			
			
		}  //end while
		System.out.println("프로그램을 종료합니다.");
	}

}
