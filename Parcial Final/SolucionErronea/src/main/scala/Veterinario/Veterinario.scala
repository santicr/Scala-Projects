package Veterinario
import Animal._

class Veterinario{
	//Atributos

	//Métodos
	def aplicarCura(tipo : String){
		println("El gato ha sido curado con la cura: " + tipo);
	}

	def Curar(animal : Animal){
		if(animal._tipo == "perro"){
			aplicarCura("curaPerro");
		}
		else if(animal._tipo == "gato"){
			aplicarCura("curaGato")
		}
		else{
			aplicarCura("curaHamster")
		}
	}
}