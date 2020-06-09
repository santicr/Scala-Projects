import Veterinario._
import Animal._
import Gato._
import Perro._
import Hamster._
import Visitante._

object main extends App{
	var gato : Gato = new Gato();
	var perro : Perro = new Perro();
	var hamster : Hamster = new Hamster();

	var curaG : Visitante = new Veterinario();
	var curaP : Visitante = new Veterinario();
	var curaH : Visitante = new Veterinario();

	curaG.Visitar(gato);
	curaP.Visitar(perro);
	curaH.Visitar(hamster);

	println("El gato ha sido curado con la cura: " + gato._cura);
	println("El perro ha sido curado con la cura: " + perro._cura);
	println("El hamster ha sido curado con la cura: " + hamster._cura);

	var visitanteCura : Visitante = new Veterinario();

}