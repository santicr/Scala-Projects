package compus

class PC{
    var _tamMemoriaRam = 0 : Double 
    var _tamDiscoDuro = 0 : Double
    var _tamProcesador = 0 : Double
    var _tamMemoriaVideo = 0 : Double
    var _estado = false : Boolean
    var _estadoVentilador = false : Boolean
    var _estadoRefrigeracionLiquida = false : Boolean

    //Sets
    def tamMemoriaRam_(tRam : Double) = _tamMemoriaRam = tRam
    def tamDiscoDuro_(tDisco : Double) = _tamDiscoDuro = tDisco
    def tamProcesador_ (tP : Double) = _tamProcesador = tP
    def tamMemoriaVideo_ (tMV : Double) = _tamMemoriaVideo = tMV

    //Comportamientos
    def modificarRam(tamTarea : Double): Unit = {
        _tamMemoriaRam -= tamTarea
    }

    def modificarDisco(tamArch : Double): Unit = {
        _tamDiscoDuro -= tamArch
    }

    def modificarProcesador(tamTarea : Double): Unit = {
        _tamProcesador -= (tamTarea / 2)
    }

    def modificarMemVideo(tamJuego : Double): Unit = {
        _tamMemoriaVideo -= (tamJuego * 2)
    }

    def modificarVentiladores(): Unit = {
        if(_estadoVentilador == false){
            _estadoVentilador = true
        }
        else{
            _estadoVentilador = false
        }
    }

    def modificarRefrigeracionLiquida(): Unit = {
        if(_estadoRefrigeracionLiquida == false){
            _estadoRefrigeracionLiquida = true
        }
        else{
            _estadoRefrigeracionLiquida = false
        }
    }

    //Metodos
    def hacerTarea(tamTarea : Double): Boolean = {
        var resultado = false : Boolean
        if(_tamMemoriaRam >= tamTarea && tamTarea > 0){
            modificarRam(tamTarea)
            if(_tamProcesador >= tamTarea && tamTarea > 0){
                modificarProcesador(tamTarea)
                resultado = true
            }
        }
        return resultado
    }

    def descargarArchivo(tamArch : Double): Boolean = {
        var resultado = false : Boolean
        if(_tamMemoriaRam >= 2){
            modificarRam(2)
            if(_tamDiscoDuro >= tamArch && tamArch > 0){
                modificarDisco(tamArch)
                resultado = true
            }
        }
        return resultado
    }

    def eliminarArchivo(tamArch : Double): Boolean = {
        var resultado = false : Boolean
        if(tamArch > 0){
            modificarDisco(-tamArch)
            resultado = true
        }
        return resultado
    }

    def apagar(): Unit = {
        _estado = false
    }

    def prender(): Unit = {
        _estado = true
    }

    def controlarRefrigeracion(): Unit = {
        modificarRefrigeracionLiquida()
        modificarVentiladores()
    }

}