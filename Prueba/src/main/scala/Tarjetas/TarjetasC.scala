package Tarjetas

class TarjetasC{
    private var _clave : Int = 123 //private
    var _saldo : Int = 321 //public

    def clave = _clave //Get
    def clave_ (nClave : Int) = _clave = nClave //Set
}