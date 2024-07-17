package downcasting;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();

		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());

		for (Animal animal : list) {
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			}
			if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}

	}

}
