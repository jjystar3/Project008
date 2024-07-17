package polymorphism.quiz;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리"));
		list.add(new VIPCustomer("또치"));
		list.add(new GoldCustomer("도우너"));
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
	}

}


class Customer {

	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public void calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	// 재정의 규칙: 선언부 그대로, 구현부만 변경
	@Override
	public void calcPrice(int price) {

		bonusPoint += (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");

	}

}

class GoldCustomer extends Customer{

	double saleRatio;

	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {

		bonusPoint += (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");

	}

}