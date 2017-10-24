package ExceptionPropia1;

import java.io.IOException;

//Funcaria igual si en vez de Extender de Exception heredara de IOException

public class ExceptionCreada extends Exception{

	public ExceptionCreada() {}
	
	public ExceptionCreada(String mje){
		super(mje);
	}

}
