
public class NodoFactura {
	Factura factura;
	NodoFactura left;
	NodoFactura right;
	
	
	public NodoFactura(Factura factura, NodoFactura left, NodoFactura right) {
		super();
		this.factura = factura;
		this.left = left;
		this.right = right;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public NodoFactura getLeft() {
		return left;
	}


	public void setLeft(NodoFactura left) {
		this.left = left;
	}


	public NodoFactura getRight() {
		return right;
	}


	public void setRight(NodoFactura right) {
		this.right = right;
	}
	

}
