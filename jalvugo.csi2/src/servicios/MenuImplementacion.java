package servicios;

import controladores.Inicio;
import dtos.ClienteDto;

/**
 * Clase que gestiona los menus de la aplicacion
 * 10102024
 * @author jalvugo
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccionPrin() {
		
		int opcion;
		
		System.out.println("#########################");
		System.out.println("0. Salir de la aplicación");
		System.out.println("1. Menu empleado");
		System.out.println("2. Menu gerencia");
		System.out.println("#########################");
		System.out.println("elija una opcion: ");
		opcion=Inicio.sc.nextInt();
		return opcion;
	}

	
	private int mostrarMenuYSeleccionGer() {
		
		int opcion;
		
		System.out.println("#########################");
		System.out.println("0. Volver al menu principal");
		System.out.println("1. Crear un nuevo cliente");
		System.out.println("#########################");
		System.out.println("elija una opcion: ");
		opcion=Inicio.sc.nextInt();
		return opcion;
	}
	
	private int mostrarMenuYSeleccionEmp() {
		
		int opcion;
		
		System.out.println("#########################");
		System.out.println("0. Volver al menu principal");
		System.out.println("1. Crear una nueva venta");
		System.out.println("2. Calculo total de ventas mensual");
		System.out.println("#########################");
		System.out.println("elija una opcion: ");
		opcion=Inicio.sc.nextInt();
		return opcion;
	}
	
	public void menuGer() {
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		int opcion;
		boolean cerrarMenu=false;
		
		do {
			opcion=mostrarMenuYSeleccionGer();
			
			switch(opcion) {
				
			case 0:
				System.out.println("Se volvera al menu principal");
				fi.escribirEnFicheroLog("Se volvera al menu principal");
				cerrarMenu=true;
				break;
				
			case 1:
				System.out.println("Se creara un nuevo cliente");
				fi.escribirEnFicheroLog("Se creara un nuevo cliente");
				oi.crearCliente();
				
				for(ClienteDto cliente:Inicio.listaClientes) {
					System.out.println(cliente.toString());
				}
				break;
				
			default:
				System.out.println("opcion introducida no valida");
				fi.escribirEnFicheroLog("opcion introducida no valida");
				break;
			}
		}while(!cerrarMenu);
		
	}


	
	
	@Override
	public void menuEmp() {
		
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		int opcion;
		boolean cerrarMenu=false;
		
		do {
			opcion=mostrarMenuYSeleccionEmp();
			
			switch(opcion) {
				
			case 0:
				System.out.println("Se volvera al menu principal");
				fi.escribirEnFicheroLog("Sel volvera al menu principal");
				cerrarMenu=true;
				break;
				
			case 1:
				System.out.println("Se añadira una venta");
				fi.escribirEnFicheroLog("Se añadira una venta");
				oi.crearVenta();
				
				break;
				
				case 2:
					System.out.println("Cálculo total de ventas mensual");
					fi.escribirEnFicheroLog("Cálculo total de ventas mensual");
					oi.calculoTotal();
					break;
				
			default:
				System.out.println("opcion introducida no valida");
				fi.escribirEnFicheroLog("opcion introducida no valida");
				break;
			}
		}while(!cerrarMenu);
		
	}

	
	
}
