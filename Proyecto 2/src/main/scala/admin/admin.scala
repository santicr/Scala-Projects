package persona

import persona._

class Admin(nombre : String, cedula : String, contra : String,
	edad : Int, correo : String) extends Persona(nombre, cedula, contra, edad,
	correo){
	//Atributos
	
	//Métodos
	def crearPelicula(titulo : String, genero : String, duracion_min : Double) = {

	}

	def eliminarPelicula(titulo : String) : Unit = {

	}

	def eliminarUsuario(cedula : String) : Unit = {

	}

	def inhabilitarUsuario(cedula : String) : Unit = {

	}

}