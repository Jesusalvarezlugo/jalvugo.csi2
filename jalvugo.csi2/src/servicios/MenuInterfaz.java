package servicios;

/**
 * Interfaz que gestiona los menus de la aplicación
 * 10102024
 * @author jalvugo
 */
public interface MenuInterfaz {
	
	/**
	 * Método para mostrar el menu principal y coger la opción del usuario.
	 * 10102024
	 * @author jalvugo
	 * @return la opcion introducida
	 */
	public int mostrarMenuYSeleccionPrin();
	
	/**
	 * Método que contiene la operativa del menu de gerencia
	 * 10102024
	 * @author jalvugo
	 */
	
	public void menuGer();
	
	/**
	 * Método que contiene la operativa del menu de empleados
	 * 10102024
	 * @author jalvugo
	 */
	
	public void menuEmp();

}
