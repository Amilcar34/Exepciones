package ExceptionPropia2;

public final class Perro {

	private String nombre;
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void cambiarNombre(String nombre) throws MyException{
		
		if(nombre.length() < 3)
			throw new MyException("No se permite una longitud menor a 3 como nombre");
		else
			this.nombre = nombre;
				
	}

}
