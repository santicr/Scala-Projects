package persona

class Persona{
	//Atributos
	protected var _nombre = "" : String;
	protected var _cedula = "" : String;
	protected var _contra = "" : String;
	protected var _edad = -1 : Int;
	protected var _correo = "" : String;

	//Getters
	def nombre = _nombre;
	def cedula = _cedula;
	def contra = _contra;
	def edad = _edad;
	def correo = _correo;

	//Sets
	def nombre_ (nombreNuevo : String) = _nombre = nombreNuevo;
	def cedula_ (cedulaNueva : String) = _cedula = cedulaNueva;
	def contra_ (contraNueva : String) = _contra = contraNueva;
	def edad_ (edadNueva : Int) = _edad = edadNueva;
	def correo_ (correoNuevo : String) = _correo = correoNuevo;

	//Métodos
	def editarDatos (nombreNuevo : String, cedulaNueva : String,
		contraNueva : String, edadNueva : Int, correoNuevo : String) : Unit = {
		_nombre = nombreNuevo;
		_cedula = cedulaNueva;
		_contra = contraNueva;
		_edad = edadNueva;
		_correo = correoNuevo;
	}

	//Constructor
	def this (nombreNuevo : String, cedulaNueva : String,
		contraNueva : String, edadNueva : Int, correoNuevo : String) = {
		this();
		_nombre = nombreNuevo;
		_cedula = cedulaNueva;
		_contra = contraNueva;
		_edad = edadNueva;
		_correo = correoNuevo;
	}

}