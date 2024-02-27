package ch08.ex10;

public class Person {
	String name;
	String gender;
	int age;
	String job;
	String address;
	String workingCompany;
	public Person(String _name, String _gender, int _age, String _job, String _address, String _workingCompany) {
		name = _name;
		gender = _gender;
		age = _age;
		job = _job;
		address = _address;
		workingCompany = _workingCompany;
	}
	
	
	//먹는다.
	public void eat(String food) {
		System.out.println(food+"를 먹습니다.");
	}
	
	//일한다.
	public void work(String work) {
		System.out.println(work+" 작업을 합니다.");
	}
	
	//운전한다.
	public void drive(String car) {
		System.out.println(car+"를 운전을 합니다.");
	}
	
	//게임하다.
	public void playGame(String game) {
		System.out.println(game+" 게임을 합니다.");
	}
	
	
	public void getPersonInfo() {
		System.out.println("이름: " + name 
				         +"\n성별: " + gender
				         +"\n나이: " + age
				         +"\n직업: " + job
				         +"\n주소: " + address
				         +"\n회사: " + workingCompany); 
	}
	
	
	
}
