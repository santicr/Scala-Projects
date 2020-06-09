package Pasaje
import ServicioEspecial._

class Pasaje{
	//Atributos
	var _id : String;
	var _fecha : String;
	var _hora : Double;
	//var _vuelo : Vuelo;
	var _serviciosEspeciales : List [ServicioEspecial];
	var _numMaletas : Int;
	var _tipoPasaje : TipoPasaje;
}