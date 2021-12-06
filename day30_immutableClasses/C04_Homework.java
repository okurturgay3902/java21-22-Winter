package day30_immutableClasses;

public class C04_Homework {

	public static void main(String[] args) {

		String a = "";
		a += 2;
		a += 'c';
		a += false;

		if (a == "2cfalse") {
			System.out.println("=="); // yazmaz "2cfalse" ile a nin referanslari farkli

		}

		if (a.equals("2cfalse")) {
			System.out.println("equals"); // equals True old.
		}

		System.out.println(a);

	}

}
