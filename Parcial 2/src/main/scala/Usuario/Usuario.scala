package Usuario
import Sistema._

class Usuario{
	//Atributos
	private var _idUsuario = "" : String;

	//Getters
	def idUsuario = _idUsuario;

	//Setters
	def idUsuario_(id : String) = _idUsuario = id;

	//Metodos
	def ReservarSalon(idSalon : String) : Unit = {
		
	}
}