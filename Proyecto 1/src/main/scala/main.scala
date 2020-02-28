import compus._

object main extends App{
    var computador = new PC()
    //Cuando el computador se prende (Constructores)
    
    computador.prender()
    computador.tamMemoriaRam_(16000)
    computador.tamDiscoDuro_(1000)
    computador.tamProcesador_(3500)
    computador.tamMemoriaVideo_(5.0)

    computador.hacerTarea(2)
    //println(computador._estado)
    //println(computador._tamMemoriaRam)
    //println(computador._tamProcesador)
    computador.descargarArchivo(50)
    //println(computador._tamDiscoDuro)
    computador.eliminarArchivo(50)
    //println(computador._tamDiscoDuro)
    computador.controlarRefrigeracion()
    //println(computador._estadoRefrigeracionLiquida)
    //println(computador._estadoVentilador)



    //Cuando el computador se apaga
    computador.apagar()
    println(computador._estado)
    computador.tamMemoriaRam_(16)
    computador.tamDiscoDuro_(1000)
    computador.tamProcesador_(3.0)
    computador.tamMemoriaVideo_(5.0)

}