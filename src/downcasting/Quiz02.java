package downcasting;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));
		
		for(Person person : list) {
			person.eating();
			if (person instanceof Student) {
				Student stu = (Student) person;
				stu.studing();
			}
			if (person instanceof Employee) {
				Employee emp = (Employee) person;
				emp.working();
			}
		}
		
	}

}

class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void eating() {
		System.out.println(name + "가 밥을 먹는다");
	}
}

class Student extends Person{

	public Student(String name) {
		super(name);
	}
	
	public void studing() {
		System.out.println(name + " 학생이 공부를 한다");
	}
	
}

class Employee extends Person{

	public Employee(String name) {
		super(name);
	}
	
	public void working() {
		System.out.println(name + " 회사원이 일을 한다");
	}
	
}