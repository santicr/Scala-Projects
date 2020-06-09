package Perro
import Animal._

class Perro extends Animal{
	//Atributos

	//Constructor
	def this(tipo : String){
		this();
		_tipo = tipo;
	}
}