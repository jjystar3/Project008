package inheritance;

public class Quiz01 {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.leg = 4;
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2;
		eagle.wing = 2;
		
	}

}

class Animal {
	int leg;
}

class Tiger extends Animal {
	int tail;
}

class Eagle extends Animal {
	int wing;
}