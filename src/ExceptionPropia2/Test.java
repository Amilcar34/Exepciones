package ExceptionPropia2;

public final class Test {

	public static void main(String[] args) {

		Perro p = new Perro("Chacho");
		System.out.println(p.getNombre());
		
		TestControlador.examinaNombre(p, "Juan");
		System.out.println(p.getNombre());

		TestControlador.examinaNombre(p, "Ju");
		

	}

	
}

	
