package edu;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte age;
		short point;
		int price;
		long totalSales;
		float fprice;
		double dprice;
		String stc;
		
		age = 23;
		point = 32000;
		price = 3500000;
		totalSales = 2147483648L;
		fprice = 10.1010f;
		dprice = 10.1111;
		stc = String.format("%.2f", fprice);

		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);	
		
		System.out.print(point + "\n");
		System.out.printf("point는 %d 입니다. \n", point);
		System.out.print(totalSales + "\n");
		
		System.out.println("fprice는 " + stc + " 입니다." );
		
		int v1 = 100;
		int v2 = 200;
		
		int t1 = v1 * v2;
		
		System.out.println(t1);
	}

}
