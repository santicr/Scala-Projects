import Usuario._
import Pelicula._
import Plan._
import ModuloSistema._

object main extends App{
	var sis = new ModuloSistema();

	var admin = new Usuario("Santiago", "1234", "321", "18", "santicr@", true);

	var usuario = sis.RegistrarUsuario("Carlos", "123", "321", "19", "carlos@", false);

	sis.CrearPelicula(true, "Hola", "Terror", 30, "123");

	var s : Boolean = admin._esAdmin;

	sis.CrearPelicula(s, "Hola2", "Terror", 30, "1231");

	sis.EliminarPelicula(true, "Hola");

	//sis.EliminarUsuario(true, "123");

}