package typecasting;

public class Ex02 {

	public static void main(String[] args) {
		
		VIPCustomer2 vipCustomer2 = new VIPCustomer2("둘리");
		
	}

}

class Customer2 {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer2(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}

	public void calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}
	
	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
}

class VIPCustomer2 extends Customer2 {
	
	double saleRatio;
	
	public VIPCustomer2(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
}