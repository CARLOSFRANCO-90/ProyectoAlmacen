import java.util.PriorityQueue;

public class Almacen {
	
	PriorityQueue<Cliente> colacliente = new PriorityQueue<Cliente>();
	
	public void addCliente(Cliente cliente) {
		colacliente.add(cliente);
		
	}
	
	public float calcularVentasAlmacen() {
		float totalDineroRecaudado = 0;
		
		for(Cliente cliente : colacliente) {
			totalDineroRecaudado = totalDineroRecaudado + cliente.cuentaTotal;
		}
		
		return totalDineroRecaudado;
	}
	
	// retorna un metodo en especial apartir de la id
	public NodoCliente returnNodo(NodoCliente nodo, int id) {
		if (nodo == null) {
			return null;
				}
		if (nodo.getCliente().getIdCliente()==id) {
			return nodo;
		}else {
			if (nodo.getCliente().getIdCliente() <id ) {
				return returnNodo(nodo.right, id);
					}
			return returnNodo(nodo.left, id);
				}
			}	
	// recorrer el arbol 
	public void traverse(NodoCliente root){ 
		if (root == null) {
			System.out.println("Arbol vacio");
		}else {
			System.out.println(root.getCliente().getNombreCliente());
			if (root.getLeft() != null){
				      traverse(root.left);
				    }
				  if (root.getRight() != null){
				        traverse (root.right);
			}
		}
	}
}
