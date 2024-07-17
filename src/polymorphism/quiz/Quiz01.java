package polymorphism.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		runCar(new Bus());
		runCar(new sportsCar());
		
	}
	
	public static void runCar(Car car) {
		car.drive();
	}
	
}

class Car {
	public void drive() {
		System.out.println("차가 달린다");
	}
}

class Bus extends Car{

	@Override
	public void drive() {
		System.out.println("버스가 달린다");
	}
	
}

class sportsCar extends Car{

	@Override
	public void drive() {
		System.out.println("스포츠카가 달린다");
	}
	
}