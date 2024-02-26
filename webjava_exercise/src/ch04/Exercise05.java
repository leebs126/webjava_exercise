package ch04;

public class Exercise05 {
	
	public static void main(String[] args) {
		int money = 167_730;
		int count50000 = 0, count10000=0, count5000 = 0, count1000 = 0;
		int count500 = 0, count100 = 0, count50 = 0, count10 = 0;
		
		count50000 = money / 50000;  //5만원권을 구합니다.
//		System.out.println(count50000);
		
		money = money % 50000;
		count10000 = money / 10000;  //1만원권을 구합니다.
//		System.out.println(count10000);
		
		money = money % 10000;
		count5000 = money / 5000;	 //5천원권을 구합니다.
//		System.out.println(count5000);
		
		money = money % 5000;
		count1000 = money / 1000;	 //1천원권을 구합니다.
//		System.out.println(count1000);
		
		money = money % 1000;
		count500 = money / 500;	 //5백원권을 구합니다.
//		System.out.println(count500);
		
		money = money % 500;
		count100 = money / 100;	 //1백원권을 구합니다.
//		System.out.println(count100);
		
		money = money % 100;
		count50 = money / 50;	 //50원권을 구합니다.
//		System.out.println(count50);
		
		money = money % 50;
		count10 = money / 10;	 //10원권을 구합니다.
//		System.out.println(count10);
		
		System.out.println( "50000원: " + count50000 
				           + "\n10000원: " + count10000
				           + " \n5000원: " + count5000
				           + " \n1000원: " + count1000
				           + "  \n500원: " + count500
				           +"   \n100원: " + count100
				           +"    \n50원: " + count50
				           +"    \n10원: " + count10
				           );
		
		
		System.out.println();
		System.out.println((50000 * count50000) 
				          + (10000 * count10000) 
				          + (5000 * count5000)
				          + (1000 * count1000)
				          + (500 * count500)
				          + (100 * count100) 
				          + (50 * count50)
				          + (10 * count10) +"원");
		
		
		
		
		
		
		
		
		
		
		
	}

}
