/*
Obligar a otros desarrolladores que cuando implementen una clase abstracta
tiene que cumplir las caracteristicas implementadas en la clase abastracta.
Es decir, obliga a la creación de una objecto con las caracteristicas que tenga la clase abstracta 
*/

/*
Force other developers that when implementing an abstract class
it has to fulfill the characteristics implemented in the abastracta class.
That is, it forces the creation of an object with the characteristics that the abstract class has
*/
abstract class Animal{
	int patas;
	public abstract void emitirSonido();
}

class Perro extends Animal{
	int patas;
	int colas;
	public void emitirSonido(){
		System.out.println("emite WOUUU");	
	}
}

class abstractClass{
	public static void main(String[] args){
		Perro myObj = new Perro();
		myObj.emitirSonido();
		myObj.patas = 4;
		System.out.println(myObj.patas);
	}
}
