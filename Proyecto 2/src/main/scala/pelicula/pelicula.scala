package pelicula

class Pelicula{
	//Atributos
	var _titulo = "" : String;
	var _genero = "" : String;
	var _duracion_min = -1 : Double;
	var _codigo = "" : String;
	protected var _reproducciones = -1 : Int;

	//Getters
	def reproducciones = _reproducciones;

	//Setters
	def reproducciones_ (reproducciones : Int) = _reproducciones = reproducciones;

	def this(titulo : String, genero : String, duracion : Double, codigo : String) = {
		this();
		_titulo = titulo;
		_genero = genero;
		_duracion_min = duracion;
		_codigo = codigo;
		_reproducciones = 0;
	}

}