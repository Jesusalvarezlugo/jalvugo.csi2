package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.ClienteDto;
import dtos.VentaDto;

public class OperativaImplementacion implements OperativaInterfaz {

	
	@Override
	public void crearCliente() {
		
		
		
		
			ClienteDto cliente = nuevoCliente();
			
			Inicio.listaClientes.add(cliente);
			
			
		
	}
	
	/**
	 * Método para generar un nuevo cliente
	 * @return el cliente generado
	 * 10102024
	 *  @author jalvugo
	 */
	private ClienteDto  nuevoCliente() {
		
		ClienteDto cliente = new ClienteDto();
		
		System.out.println("Introduzca el nombre del cliente: ");
		cliente.setNombreCliente(Inicio.sc.next());
		System.out.println("Introduzca los apellidos del cliente: ");
		cliente.setApellidosCliente(Inicio.sc.next());
		cliente.setIdCliente(idCliente());
		
		return cliente;
	}
	
	/**
	 * Método para generar el id del cliente
	 * @return el nuevo id
	 * 10102024
	 * @author jalvugo
	 */
	private long idCliente() {
		
		long idNuevo;
		int tamanioLista=Inicio.listaClientes.size();
		
		if(tamanioLista > 0) {
			idNuevo=Inicio.listaClientes.get(tamanioLista - 1).getIdCliente() + 1;
		}else {
			idNuevo=1;
		}
		
		return idNuevo;
	}

	@Override
	public void crearVenta() {
		
		VentaDto venta = nuevaVenta();
		
		Inicio.listaVentas.add(venta);
		
	}
	
	/**
	 * Método para generar una nueva venta
	 * 10102024
	 * @author jalvugo
	 */
	
	private VentaDto nuevaVenta() {
		
		VentaDto venta = new VentaDto();
		
		System.out.println("Introduzca el importe de la venta: ");
		venta.setImporteVenta(Inicio.sc.nextDouble());
		System.out.println("Introduzca el id del cliente del que sera la venta: ");
		venta.setIdCliente(Inicio.sc.nextLong());
		venta.setIdVenta(idVenta());
		venta.setFechaVenta(LocalDate.now());
		
		return venta;
	}
	
	/**
	 * Método para generar el id de la venta
	 * 10102024
	 * @author jalvugo
	 */
	private long idVenta() {
		
		long idNuevo;
		int tamanioLista=Inicio.listaVentas.size();
		
		if(tamanioLista > 0) {
			idNuevo=Inicio.listaVentas.get(tamanioLista - 1).getIdCliente() + 1;
		}else {
			idNuevo=1;
		}
		
		return idNuevo;
	}

	@Override
	public void calculoTotal() {
		
		String fechaAPedir;
		String fechaAPars;
		double importeTotal=0.0;
		DateTimeFormatter formato =  DateTimeFormatter.ofPattern("MM-yyyy");
		System.out.println("Introduce la fecha que desee calcular el importe total(MM-yyyy)");
		fechaAPedir=Inicio.sc.next();
		
		for(VentaDto venta:Inicio.listaVentas) {
			
			fechaAPars=venta.getFechaVenta().format(formato);
			if(fechaAPars.equals(fechaAPedir)) {
				importeTotal=venta.getImporteVenta();
				importeTotal+=venta.getImporteVenta();
			}else {
				System.out.println("No hay ventas para esa fecha");
				break;
			}
			
		}
		
		System.out.println("Importe ventas para el mes "+fechaAPedir+" es: "+importeTotal);
		
		
		
	}

}
