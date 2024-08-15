package linkedList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String args[]) {
		
		Lista listita = new Lista();
		int opcion = 0,el;
		
		do {
			try {
				opcion =  Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar un elemento al inicio de la lista \n"
						+ "2. Agregar un elemento al final de la lista \n"
						+ "3. Mostrar los datos de la lista \n"
						+ "4. Eliminar un elemento del inicio de la lista \n"
						+ "5. Eliminar un elemento del final de la lista \n"
						+ "6. Eliminar un elemento en especifico \n"
						+ "7. salir","Menu de opciones",3));  
				
				switch(opcion) {
				case 1:
					try {
						el =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el dato","Insertando al inicio",3));   
						listita.agregarAlInicio(el);
					}catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
						
					}
					break;
				case 2:
					try {
						el =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el dato","Insertando al final",3));   
						listita.agregarAlFinal(el);;
					}catch(NumberFormatException n) {
						JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
						
					}
					break;
				case 3:
					listita.mostrarLista();
					break;		
				case 4:
					el = listita.borrarDelInicio();
					JOptionPane.showMessageDialog(null, "El elemento eliminado es "+el, "Eliminando Nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					el = listita.borrarDelFinal();
					JOptionPane.showMessageDialog(null, "El elemento eliminado es "+el, "Eliminando Nodo del final",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					el =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar","Eliminando Nodos en especifico",JOptionPane.INFORMATION_MESSAGE));   
					listita.eliminar(el);					
					JOptionPane.showMessageDialog(null, "El elemento eliminado es "+el, "Eliminando Nodo en especifico",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
					default:
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
					
				}
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
			}
		}while(opcion != 7);

	
		

		
	}

}
