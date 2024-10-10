package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que contiene métodos de utilidad
 * 10102024
 * @author jalvugo
 */
public class Utilidades {
	
	public static  String nombreFicheroLog() {
		String nombreFichero="";
		String fechaAString="";
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
		
		fechaAString=fechaActual.format(formato);
		
		nombreFichero=nombreFichero.concat("log-").concat(fechaAString).concat(".txt");
		
		return nombreFichero;
		
	}

}
