package dtos;

/**
 * Clase para la entidad cliente
 * 10102024
 * @author jalvugo
 */
public class ClienteDto {

	//Atributos
	
	long idCliente;
	String nombreCliente="aaaaa";
	String apellidosCliente="aaaaa";
	
	//Getters y Setters
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
	
	@Override
	public String toString() {
		return "ClienteDto [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + "]";
	}
	
	
	
	
	
	
}
