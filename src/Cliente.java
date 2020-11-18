
public class Cliente implements Comparable<Cliente> {

	public int idCliente;
	public String nombreCliente;
	public long telefono;
	public float cuentaTotal;
	
    //Constructores
	public Cliente(int idCliente, String nombreCliente, long telefono, float cuentaTotal) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.cuentaTotal = cuentaTotal;
	}


	//Getter and Setter
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public int prioridad;
	
	@Override
	public int compareTo(Cliente otroCliente) {
		return otroCliente.prioridad - this.prioridad;
	}
	
}
