package day43_interface;

public abstract class Animal {

		public abstract String getName();
		
}

abstract class BigCat extends Animal{
	
	public String getName() {
		
		return "BigCat";
		
	}
	
	public abstract void roar();
	
}


class Lion extends BigCat {
	
	public void roar() {
		
		System.out.println("The Lion lets a loud ROAR!");
	}
}

// CTE vermedi incele