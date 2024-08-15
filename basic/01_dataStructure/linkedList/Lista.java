package linkedList;

public class Lista {
//	puntero para saber donde esta el inicio y el final
	protected Nodo inicio;
	protected Nodo fin;
	
//	metodo para gregar un nodo al inicio de la lista
	public Lista() {
		inicio = null;
		fin = null;
	}
	
//	metodo para saber si la lista esta vacia
	public boolean estaVacia() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}		
	}
	
	//metodo para mostrar los datos
	public void agregarAlInicio (int elemento) {		
		//creando el nodo 
		inicio = new Nodo(elemento, inicio);
		if(fin == null) {
			fin = inicio;			
		}
	}
	
//	metodo para insertar al final de la lista
	public void agregarAlFinal(int elemento) {
//		revisar si esta vacia
		
		if(!estaVacia()) { //si no esta vacia haga algo
			fin.siguiente = new Nodo(elemento);
			fin = fin.siguiente;
		}else {
//			si entra acá es porque la lista esta vacia
//			el inicio y el fin van a apuntar al nuevo nodo 
			inicio = fin = new Nodo(elemento);
			
//			esto es lo mismo que decir 
//			inicio = new Nodo(elemento);
//			   fin = new Nodo(elemento);
			
		}
	}
	
//	metodo para mostra los datos
	public void mostrarLista() {
		
		Nodo recorrer = inicio;
		System.out.println("");
		while(recorrer != null) {
			System.out.print("["+recorrer.dato+"] -->");
			recorrer = recorrer.siguiente;			
		}
	}
	
//	metodo para eleminar un nodo del inicio
	public int borrarDelInicio() {
		int elemento = inicio.dato;
		
		// si inicio == fin quiere decir que nada mas hay 1 nodo
		if(inicio == fin) {
			inicio = fin = null;			
		}else {
			//en este caso ya hay almenos dos nodos
			inicio = inicio.siguiente;
		}
		return elemento;
	}
	
//	método para eleminar un Nodo del final 
	public int borrarDelFinal() {
		int elemento =  fin.dato;
		if(inicio == fin) {
			inicio=fin=null;			
		}else {
			Nodo temporal = inicio;
			while(temporal.siguiente != fin) {
				temporal = temporal.siguiente;				
			}
			fin = temporal;
			fin.siguiente = null;		
		}
		return elemento;
	}
	
//	metodo para eliminar un Nodo en específico
	public void eliminar(int elemento) {
		
		if(!estaVacia()) {//si no está vacio haga algo
			
//			quiere decir que ya lo encontre y era el primer nodo
			if(inicio == fin && elemento == inicio.dato) {
				inicio=fin=null;
			}else if(elemento == inicio.dato) { //el condicional quiere decir que es el primero y aparte la lista tiene minimo dos nodos 
				inicio = inicio.siguiente;
				
			}else {
//				crear dos punteros
//				la intencion es que el anterior apunte al primer nodo y el temporal apunte al siguiente nodo
				Nodo anterior, temporal;
				anterior = inicio;
				temporal = inicio.siguiente;
				
//				recorro la lista 

//				lo que hace el while es =>recorrer la lista hasta que encuentre el elemento que ando buscando
//				 la condicion temporal!=null  => quiere decir que no haya llegado hasta donde no hay nada 
//				la condicion  temporal.dato != elemento => quiere decir que aun no lo ha encontrado
				
				while(temporal!=null && temporal.dato != elemento) {  
					anterior = anterior.siguiente;
					temporal = temporal.siguiente;					
				}
				if(temporal != null) { //esto quiere decir que Si lo encontro 					
					anterior.siguiente = temporal.siguiente;

					
					if(temporal == fin) { //verificar que temporal sea igualito de fin => quiere decir que llego al final
//						fin = anterior => si temporal llego hasta el ultimo nodo quiere decir que ese 
//						es el que se va eleminar entonces hay que mover al fin al anterior
						fin = anterior;
					}
				}
			}
			
		}
		
	}
	
	
	
	
}
