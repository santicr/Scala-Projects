package Sistema
import Reserva._
import Usuario._
import Administrador._
import Salon._

class Sistema{
	//Atributos
	var _listaSalones = List() : List[Salon];
	var _listaReservas = List() : List[Reserva];
	var _temperaturaSistema = 23 : Double;
	var _tiempoLuzInicial = 10 : Int;
	var _tiempoLuzFinal = 5 : Int;
	var _tiempoAireInicial = 10 : Int;
	var _tiempoAireFinal = 5 : Int;
	var _listaUsuarios = List() : List[Usuario];
	var _listaAdmins = List() : List[Administrador];
}