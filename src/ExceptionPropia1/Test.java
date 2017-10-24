package ExceptionPropia1;

public final class Test {

	public static void main(String[] args) {

		try{	

			Persona p1 = new Persona("Ernesto");
			System.out.println(p1.getNombre());
			p1.cambiarNombre("je");
		
		}catch(Exception e){
			
			System.out.println("La direccion es invaldia ");
			e.printStackTrace();
		}
	}

}
