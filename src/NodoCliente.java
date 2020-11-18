
public class NodoCliente {
	Cliente cliente;
	NodoCliente left;
	NodoCliente right;
	
	//Constructores
	public NodoCliente(Cliente newCliente) {
		this.cliente = newCliente;
	}
	
	public NodoCliente(Cliente cliente, NodoCliente left, NodoCliente right) {
		this.cliente = cliente;
		this.left = left;
		this.right = right;
	}

	//Getter and Setters
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public NodoCliente getLeft() {
		return left;
	}

	public void setLeft(NodoCliente left) {
		this.left = left;
	}

	public NodoCliente getRight() {
		return right;
	}

	public void setRight(NodoCliente right) {
		this.right = right;
	}	

}
