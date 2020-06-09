package Visitante
import Gato._
import Perro._
import Hamster._

trait Visitante{
	//Métodos
	def Visitar (gato : Gato) : Unit;
	def Visitar (perro : Perro) : Unit;
	def Visitar (hamster : Hamster) : Unit;
}