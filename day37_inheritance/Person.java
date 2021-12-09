package day37_inheritance;

public class Person {
	public Person() {
		System.out.println("Person Constructor");
	}
	
	public void talk() {
		System.out.println("First Program");
	}

}


class Student extends Person {
	
	public void talk() {
		System.out.println("Second Program");
	}
}


class Test04 { //public vardi sildim
	
	public static void main(String[] args) {
		
		Person p=new Student();
		p.talk();
	}
}