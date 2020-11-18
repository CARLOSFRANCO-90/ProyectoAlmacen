
public class NodoRepuesto {
	Repuesto repuesto;
	NodoRepuesto left;
	NodoRepuesto right;
	
	//Constructores
	public NodoRepuesto(Repuesto repuesto, NodoRepuesto left, NodoRepuesto right) {
		super();
		this.repuesto = repuesto;
		this.left = left;
		this.right = right;
	}
	
	//Getters an Setters
	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	public NodoRepuesto getLeft() {
		return left;
	}

	public void setLeft(NodoRepuesto left) {
		this.left = left;
	}

	public NodoRepuesto getRight() {
		return right;
	}

	public void setRight(NodoRepuesto right) {
		this.right = right;
	}
	

}
