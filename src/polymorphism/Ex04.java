package polymorphism;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜");
		Customer customer5 = new VIPCustomer("고길동");
		
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);
		
		for(Customer customer : list) {
			customer.calcPrice(10000);
		}

		for(Customer customer : list) {
			customer.showInfo();
		}
		
	}

}
