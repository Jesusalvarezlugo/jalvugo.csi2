package servicios;
/**
 * Interfaz que controla la operativa de la aplicación
 * 10102024
 * @author jalvugo
 */
public interface OperativaInterfaz {

	/**
	 * Método para generar un nuevo cliente
	 * 10102024
	 * @author jalvugo
	 */
	public void crearCliente();
	
	/**
	 * Método para generar una nueva venta
	 * 10102024
	 * @author jalvugo
	 */
	
	public void crearVenta();
	
	/**
	 * Método para calcular el total de importe de ventas para un mes
	 * 10102024
	 * @author jalvugo
	 */
	
	public void calculoTotal();
}
