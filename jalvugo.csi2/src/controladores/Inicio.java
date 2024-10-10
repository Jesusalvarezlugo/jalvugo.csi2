package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import utils.Utilidades;
/**
 * Clase por la que se inicia la aplicación
 * 10102024
 * @author jalvugo
 */
public class Inicio {

	public static Scanner sc = new Scanner(System.in);
	public static String rutaCarpetaLog="C:\\Users\\jalvugo\\eclipse-workspace\\jalvugo.csi2\\auditoria\\";
	public static String rutaFicheroLog=rutaCarpetaLog.concat(Utilidades.nombreFicheroLog());
	public static List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	public static List<VentaDto> listaVentas = new ArrayList<VentaDto>();
	
	public static void main(String[] args) {
		
		int opcion;
		boolean cerrarMenu=false;
		MenuInterfaz mi= new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		
		do {
			try {
				
				opcion=mi.mostrarMenuYSeleccionPrin();
				
				switch(opcion) {
				
				case 0:
					System.out.println("Se cerrara la aplicaion");
					fi.escribirEnFicheroLog("Se cerrara la aplicaion");
					cerrarMenu=true;
					break;
					
				case 1:
					System.out.println("Se accedera al menu de empleados");
					fi.escribirEnFicheroLog("Se accedera al menu de empleados");
					mi.menuEmp();
					break;
					
				case 2:
					System.out.println("Se accedera al menu de gerencia");
					fi.escribirEnFicheroLog("Se accedera al menu de gerencia");
					mi.menuGer();
					break;
					
				default:
					System.out.println("Opción introducida no válida");
					fi.escribirEnFicheroLog("Opción introducida no válida");
					break;
				}
				
			}catch(Exception e) {
				System.out.println("Error en el código");
				fi.escribirEnFicheroLog("Error en el código");
			}
		}while(!cerrarMenu);

	}

}
