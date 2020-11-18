
public class Factura {
	 public int idFactura;
	 public NodoCliente cliente;
	 public Double valorFactura;
	 
	 
	public Factura(int idFactura, NodoCliente cliente, Double valorFactura) {
		super();
		this.idFactura = idFactura;
		this.cliente = cliente;
		this.valorFactura = valorFactura;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public NodoCliente getCliente() {
		return cliente;
	}


	public void setCliente(NodoCliente cliente) {
		this.cliente = cliente;
	}


	public Double getValorFactura() {
		return valorFactura;
	}


	public void setValorFactura(Double valorFactura) {
		this.valorFactura = valorFactura;
	} 

}
