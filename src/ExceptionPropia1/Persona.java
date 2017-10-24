package ExceptionPropia1;

public final class Persona {

	private String nombre;

	public Persona(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void cambiarNombre(String nombre) throws ExceptionCreada {

		if (nombre.length() < 3)
			
			throw new ExceptionCreada("No puede tener un nombre de menso de 3 caracteres");
		
		else
			this.nombre = nombre;

	}
}