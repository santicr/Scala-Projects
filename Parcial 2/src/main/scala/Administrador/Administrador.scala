package Administrador
import Sistema._

class Administrador{
	//Atributos
	private var _idAdmin = "" : String;

	//Getters
	def idAdmin = _idAdmin;

	//Setters
	def idAdmin_(id : String) = _idAdmin = id;

	//Metodos
	def CambiarTemperatura(temperatura : Double, sistema : Sistema) : Unit = {
		sistema._temperaturaSistema = temperatura;
		println("Temperatura cambiada a " + sistema._temperaturaSistema + " grados");
	}

	def CambiarTiempoAireInicial(tiempoIniA : Int, sistema : Sistema) : Unit = {
		sistema._tiempoAireInicial = tiempoIniA;
		println("El encendido del aire acondicionado se prendera " + sistema._tiempoAireInicial + 
			" antes de la clase");
	}

	def CambiarTiempoAireFinal(tiempoFinA : Int, sistema : Sistema) : Unit = {
		sistema._tiempoAireFinal = tiempoFinA;
		println("El encendido del aire acondicionado se apagara " + sistema._tiempoAireFinal + 
			" despues de la clase");
	}

	def CambiarTiempoLuzInicial(tiempoIniL : Int, sistema : Sistema) : Unit = {
		sistema._tiempoLuzInicial = tiempoIniL;
		println("El encendido de la luz se prendera " + sistema._tiempoLuzInicial + 
			" antes de la clase");
	}

	def CambiarTiempoLuzFinal(tiempoFinL : Int, sistema : Sistema) : Unit = {
		sistema._tiempoLuzFinal = tiempoFinL;
		println("El encendido de la luz se prendera " + sistema._tiempoLuzFinal + 
			" antes de la clase");
	}

	def HabilitarSalon(idSalon : String, sistema : Sistema) : Unit = {
		for(salon <- sistema._listaSalones){
			if(salon._id == idSalon){
				salon._habilitado = true;
			}
		}
	}

	def DeshabilitarSalon(idSalon : String, sistema : Sistema) : Unit = {
		for(salon <- sistema._listaSalones){
			if(salon._id == idSalon){
				salon._habilitado = false;
				salon._aire = false;
				salon._luz = false;
				salon._puerta = false;
			}
		}
	}
	
}