package inheritance;

public class Quiz03 {

	public static void main(String[] args) {
		
		BallPen ballpen = new BallPen();
		ballpen.thickness = 2;
		ballpen.inkAmount = 100;
		ballpen.color = "파랑색";
		
		FountainPen fountainPen = new FountainPen();
		fountainPen.thickness = 3;
		fountainPen.inkAmount = 80;
		fountainPen.brand = "몽블랑";
		
	}

}

class Pen {
	int thickness;
	int inkAmount;
}

class BallPen extends Pen {
	String color;
}

class FountainPen extends Pen {
	String brand;
}