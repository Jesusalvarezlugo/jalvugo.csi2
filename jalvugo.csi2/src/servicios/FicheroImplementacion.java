package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

/**
 * Clase que gestionañ los ficheros
 * 10102024
 * @author jalvugo
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void escribirEnFicheroLog(String texto) {
		
		try {
			FileWriter escritor = new FileWriter(Inicio.rutaFicheroLog,true);
			
			escritor.write(texto);
			escritor.close();
		}catch(IOException e) {
			System.out.println("Error al escribir en el fichero log");
		}
		
		
	}

}
