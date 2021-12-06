package day28_construtorCall_statickeyword;

public class Deneme {
	
	static int count=0;
	
	public void increment() {
		count++;
	}

	public static void main(String[] args) {
		Deneme obje1=new Deneme();
		
		Deneme obje2=new Deneme();
		
		obje1.increment();
		
		obje2.increment();
		
		System.out.println("Obje1= count is="+ obje1.count);
		System.out.println("Obje2= count is="+ Deneme.count);

	}

}
