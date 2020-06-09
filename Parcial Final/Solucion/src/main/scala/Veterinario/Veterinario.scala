package Veterinario
import Visitante._
import Gato._
import Perro._
import Hamster._

class Veterinario extends Visitante{
	def Visitar (gato : Gato){
		gato._cura = "curaGato";
	}
	def Visitar (perro : Perro){
		perro._cura = "curaPerro";
	}
	def Visitar (hamster : Hamster){
		hamster._cura = "curaHamster";
	}
}