
public class Repuesto {
	public int idRepuesto;
	public String nombreRepuesto;
	public int stock;
	public int cantidad;
	public float precio;
	public float precioTotal;
     
     //Constructores
	public Repuesto(int idRepuesto, String nombreRepuesto, int stock, int cantidad, float precio, float precioTotal) {
		super();
		this.idRepuesto = idRepuesto;
		this.nombreRepuesto = nombreRepuesto;
		this.stock = stock;
		this.cantidad = cantidad;
		this.precio = precio;
		this.precioTotal = precioTotal;
	}

	
	public int getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(int idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getNombreRepuesto() {
		return nombreRepuesto;
	}

	public void setNombreRepuesto(String nombreRepuesto) {
		this.nombreRepuesto = nombreRepuesto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

}
