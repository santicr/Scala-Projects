package admin
import pelicula._
import persona._

class Admin(nombre : String, cedula : String, contra : String,
	edad : Int, correo : String) extends Persona(nombre, cedula, contra, edad,
	correo){
	//Atributos
	
	//Métodos
	def crearPelicula(titulo : String, genero : String, duracion : Double,
	 codigo : String) : Pelicula = {
		var nuevaPelicula = new Pelicula(titulo, genero, duracion, codigo);
		return nuevaPelicula;
	}

	def eliminarPelicula(titulo : String) : Unit = {

	}

	def eliminarUsuario(cedula : String) : Unit = {

	}

	def inhabilitarUsuario(cedula : String) : Unit = {

	}

}