package Gato
import Animal._

class Gato extends Animal{
	//Atributos

	//Constructor
	def this(tipo : String){
		this();
		_tipo = tipo;
	}
}