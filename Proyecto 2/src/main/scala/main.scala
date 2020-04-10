import persona._
import pelicula._
import admin._

object main extends App{
	var p1 = new Persona("Santiago", "321", "123", 18, "santicr@");
	var p2 = new Admin("Santiago", "321", "123", 18, "santicr@");
	var p3 = new Pelicula("Tu qcha en tanga", "Terror", 120, "123456")
}