package ExceptionInterna1;

public final class Test {

	public static void main(String[] args) {

		Mueble m = new Mueble();
		
		TestControlador.asignaAltura(m, 2);
		System.out.println(TestControlador.devuelveAltura(m));
	}

}
