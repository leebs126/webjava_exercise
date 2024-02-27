package ch08.ex10;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person 인스턴스 생성
		Person hong = new Person("홍길동", "남자", 23, "프로그래머", "서울시 강동구", "오라클 게임");
		Person lee = new  Person("이순신", "남자", 33, "의사", "대전시 중구", "대전병원");
		
		
		//신상 정보 출력
		hong.getPersonInfo();
		System.out.println();
		lee.getPersonInfo();
	}
}
