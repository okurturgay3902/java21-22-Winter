package day32_varargs_strinBuilder;

public class Go {

	public static void main(String[] args) {
		
		new Go().Go(1,"hello");
		new Go().Go(2,"hello", "hi");

	}

	private void Go(int x, String... y) {
		System.out.println(y[y.length-x]+ " ");
	}
		
	}


