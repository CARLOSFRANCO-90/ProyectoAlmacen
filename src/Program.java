import java.io.IOException;

import javax.swing.JFileChooser;
import java.io.BufferedReader;

public class Program {
	
		public static void main(String[] args) throws NumberFormatException, IOException {
			JFileChooser file = new JFileChooser();	
			file.showOpenDialog(null);
			String nameFile = file.getSelectedFile().getPath();
			
			dataAsing(nameFile);

	}

		public static void dataAsing(String nameFile)throws IOException {
			int numeroClientes;
			
		
		}

}
