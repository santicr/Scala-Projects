import Gato._
import Perro._
import Hamster._
import Animal._
import Veterinario._

object main extends App {
	var gato = new Gato("gato");
	var perro = new Perro("perro");
	var hamster = new Hamster("hamster");

	var veterinario = new Veterinario();
	veterinario.Curar(gato);
	veterinario.Curar(hamster);
	veterinario.Curar(perro);
}