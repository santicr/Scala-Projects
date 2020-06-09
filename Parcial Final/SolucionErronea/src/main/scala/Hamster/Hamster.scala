package Hamster
import Animal._

class Hamster extends Animal{
	//Atributos

	//Constructor
	def this(tipo : String){
		this();
		_tipo = tipo;
	}
}