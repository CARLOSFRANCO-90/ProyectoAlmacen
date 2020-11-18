
public class ListCliente {
	
	NodoCliente root;
	
	int clientesNumero =0;
	
	//agregar un nuevo nodo al arbol
	 public NodoCliente addCliente(NodoCliente arbTemp, NodoCliente nNodo){
		 if (arbTemp == null) {
	            arbTemp = nNodo;
	            clientesNumero++;
	            System.out.println("El cliente " +nNodo.cliente.idCliente + " se agrego correctamente");
	     }else {
	    	 if (!(nNodo.getCliente().idCliente==arbTemp.getCliente().getIdCliente())) {
	    		 if (nNodo.getCliente().getIdCliente()<arbTemp.getCliente().getIdCliente()) {
	    			 arbTemp.setLeft(addCliente(arbTemp.left, nNodo));
	    		 }
	    		 if (nNodo.getCliente().getIdCliente()>arbTemp.getCliente().getIdCliente()){
		        	 arbTemp.setRight(addCliente(arbTemp.right, nNodo));
		         }	    		 
	    	 }else {
	 			System.out.println("El paciente " + nNodo.getCliente().getIdCliente() + " ya se encuentra registrado");
			} 
		}
		 return arbTemp;

	 }

}
