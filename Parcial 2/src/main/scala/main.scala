import Administrador._
import Usuario._
import Salon._
import Sistema._
import Reserva._
import java.util.Calendar
import scala.util._
import scala.io._
import scala.util.control.Breaks._

object main extends App{
	var sistema = new Sistema();
	var s1 = new Salon();
	var s2 = new Salon();
	var u1 = new Usuario();
	var a1 = new Administrador();
	u1.idUsuario_("123");
	a1.idAdmin_("321");
	s1._id = "SHA1";
	s2._id = "GHR4";
	sistema._listaSalones = List(s1);
	sistema._listaSalones = s2 :: sistema._listaSalones;
	sistema._listaUsuarios = List(u1);
	sistema._listaAdmins = List(a1);
	val now = Calendar.getInstance()
	var breakmain : Boolean = true;
	val currentHour = now.get(Calendar.HOUR_OF_DAY)
	val currentMinute = now.get(Calendar.MINUTE)
	//println(currentHour);

	while(breakmain){
		println("Bienvenido al sistema de reservas de salones!");
		println("Escribe el numero correspondiente a tu accion / tipo de persona");
		println("Inicia sesion para empezar.");
		println("1. Administrador");
		println("2. Usuario");
		println("3. Salir");

		var opcion : Try[Int] = Try(StdIn.readInt());

		if(opcion.isSuccess){
			if(opcion.get == 1){
				var admin : Administrador = new Administrador();
				var break : Boolean = true;
				var entrar : Boolean = false;
				println("Escribe tu codigo de Administrador:")
				var idAdmin : String = StdIn.readLine();

				for(admin <- sistema._listaAdmins){
					if(admin.idAdmin == idAdmin){
						entrar = true;
					}
				}

				while(break && entrar){
					println("Escoge el numero correspondiente a la accion que quieres hacer: ");
					println("1. Cambiar temperatura de los salones.");
					println("2. Cambiar el tiempo de encendido de los aires acondicionados de los salones.");
					println("3. Cambiar el tiempo de apagado de los aires acondicionados de los salones.");
					println("4. Cambiar el tiempo de encendido de la luz de los salones.");
					println("5. Cambiar el tiempo de apagado de la luz de los salones.");
					println("6. Habilitar salon.");
					println("7. Deshabilitar salon.");
					println("8. Ver informacion de los salones")
					println("9. Salir");
					var opcion2 : Try[Int] = Try(scala.io.StdIn.readInt());
					if(opcion2.isSuccess){
						if(opcion2.get == 1){
							println("Escribe la temperatura de los aires acondicionados:");
							var opcion3 : Int = scala.io.StdIn.readInt();
							admin.CambiarTemperatura(opcion3, sistema);
						}
						else if(opcion2.get == 2){
							println("Escribe los minutos para encender el aire antes de cada clase:");
							var opcion3 : Int = scala.io.StdIn.readInt();
							admin.CambiarTiempoAireInicial(opcion3, sistema);
						}
						else if(opcion2.get == 3){
							println("Escribe los minutos para apagar el aire despues de cada clase:");
							var opcion3 : Int = scala.io.StdIn.readInt();
							admin.CambiarTiempoAireFinal(opcion3, sistema);
						}
						else if(opcion2.get == 4){
							println("Escribe los minutos para encender la luz antes de cada clase:");
							var opcion3 : Int = scala.io.StdIn.readInt();
							admin.CambiarTiempoLuzInicial(opcion3, sistema);
						}
						else if(opcion2.get == 5){
							println("Escribe los minutos para apagar la luz despues de cada clase:");
							var opcion3 : Int = scala.io.StdIn.readInt();
							admin.CambiarTiempoLuzFinal(opcion3, sistema);
						}
						else if(opcion2.get == 6){
							println("Escribe el codigo del salon a habilitar:")
							var opcion3 : String = scala.io.StdIn.readLine();
							admin.HabilitarSalon(opcion3, sistema);
						}
						else if(opcion2.get == 7){
							println("Escribe el codigo del salon a deshabilitar:")
							var opcion3 : String = scala.io.StdIn.readLine();
							admin.DeshabilitarSalon(opcion3, sistema);
						}
						else if(opcion2.get == 8){
							for(reserva <- sistema._listaReservas){
								if(reserva._horaInicial == currentHour || (reserva._horaInicial == (currentHour - 1) && currentMinute + sistema._tiempoLuzInicial >= 60) || (reserva._horaInicial == (currentHour - 2) && currentMinute < sistema._tiempoLuzFinal) || reserva._horaInicial == (currentHour - 1)){
									for(salon <- sistema._listaSalones){
										if(salon._id == reserva._idSalonAsociado){
											salon._luz = true;
											println(salon._id + "     reservado a las ->     " + reserva._horaInicial + " horas       luz -> " + salon._luz);
										}
									}
								}
							}
							for(salon <- sistema._listaSalones){
								if(salon._luz == false){
									println(salon._id + "     luz ->     "+ salon._luz);
								}
							}
							for(reserva <- sistema._listaReservas){
								if(reserva._horaInicial == currentHour || (reserva._horaInicial == (currentHour - 1) && currentMinute + sistema._tiempoAireInicial >= 60) || (reserva._horaInicial == (currentHour - 2) && currentMinute < sistema._tiempoAireFinal) || reserva._horaInicial == (currentHour - 1)){
									for(salon <- sistema._listaSalones){
										if(salon._id == reserva._idSalonAsociado){
											salon._aire = true;
											println(salon._id + "     reservado a las ->     " + reserva._horaInicial + " horas       aire -> " + salon._aire);
										}
									}
								}
							}
							for(salon <- sistema._listaSalones){
								if(salon._aire == false){
									println(salon._id + "     aire ->     " + salon._aire);
								}
							}
							for(reserva <- sistema._listaReservas){
								if(reserva._horaInicial == currentHour || (reserva._horaInicial == (currentHour - 1) && currentMinute + 15 >= 60) || (reserva._horaInicial == (currentHour - 2) && currentMinute < 10) || reserva._horaInicial == (currentHour - 1)){
									for(salon <- sistema._listaSalones){
										if(salon._id == reserva._idSalonAsociado){
											salon._puerta = true;
											println(salon._id + "     reservado a las ->     " + reserva._horaInicial + " horas       puerta -> " + salon._puerta);
										}
									}
								}
							}
							for(salon <- sistema._listaSalones){
								if(salon._puerta == false){
									println(salon._id + "     puerta ->     " + salon._puerta);
								}
							}
						}
						else if (opcion2.get == 9){
							break = false;
							println("Has salido correctamente");
						}
						else{
							println("Ingresa correctamente el digito de la accion a usar.")
						}
					}
					else
						println("Ingresa solo digitos correspondientes.")
				}
				if(entrar == false)
					println("Codigo de administrador erroneo.");
			}

			else if(opcion.get == 2){
				var break : Boolean = true;
				var entrar : Boolean = false;
				println("Escribe tu codigo estudiantil: ")
				var idUser : String = StdIn.readLine();

				for(user <- sistema._listaUsuarios){
					if(user.idUsuario == idUser)
						entrar = true;
				}


				while(break && entrar){
					println("Escoge el numero correspondiente a la accion que quieres hacer: ");
					println("1. Reservar un salon.")
					println("2. Salir.")
					println("3. Recargar pagina.")

					var opcion2 : Int = StdIn.readInt();
					if(opcion2 == 1){
						println("ESTOS SON TODOS LOS SALONES Y HORAS DISPONIBLES, SI NO HAY NINGUNO VUELVE MAS TARDE")
						println("ID DE SALON             HORA MILITAR")

						for(salon <- sistema._listaSalones){
							var tiempo : Int = 7;
							var paso : Boolean = false;
							var habil : Boolean = true;
							if(salon._habilitado == false)
								habil = false;
							while(tiempo <= 17 && habil == true){
								for(reserva <- sistema._listaReservas){
									if(reserva._idSalonAsociado == salon._id){
										if(reserva._horaInicial == tiempo){
											paso = true;
										}
									}
								}
								if(paso == false)
									println(salon._id + "                         " + tiempo + ":00");

								tiempo += 2;
								paso = false;
							}
							habil = true;
						}

						println("Escribe el codigo del salon: ")
						var codigo : String = StdIn.readLine();
						println("Escribe la hora inicial de reserva del salon: (SOLO VALORES ENTEROS, EJ: 9, 15, etc)")
						var horaI : Try[Int] = Try(StdIn.readInt());
						if(horaI.isSuccess){
							println("Ingresa solo valores enteros correspondientes a las horas disponibles sin dos puntos : ni 00")
						}
						var paso : Boolean = false;
						if(horaI.get != 7 && horaI.get != 9 && horaI.get != 11 && horaI.get != 13 && horaI.get != 15 && horaI.get != 17){
							println("Has escrito una hora invalida, intenta de nuevo");
						}
						else{
							for(salon <- sistema._listaSalones){
								if(salon._id == codigo){
									paso = true;
									if(salon._habilitado == true){
										var paso2 : Boolean = false;
										var esta : Boolean = false;
										for(reserva <- sistema._listaReservas){
											if(reserva._idSalonAsociado == codigo && reserva._horaInicial != horaI.get){
												paso2 = true;
											}
											if(reserva._idSalonAsociado == codigo)
												esta = true;
										}
										if(paso2 == true || esta == false){
											paso2 = false;
											var reserv : Reserva = new Reserva;
											reserv._horaInicial = horaI.get;
											reserv._idSalonAsociado = codigo;
											reserv._reservado = true;
											reserv._idUsuarioAsociado = idUser;

											if(sistema._listaReservas.isEmpty){
												sistema._listaReservas = List(reserv);
												println("Salon reservado correctamente. La temperatura actual de los salones es de: " + sistema._temperaturaSistema)
											}
											else{
												println("Salon reservado correctamente. La temperatura actual de los salones es de: " + sistema._temperaturaSistema)
												sistema._listaReservas = reserv :: sistema._listaReservas;
											}
										}
										else
											println("Error, el salon esta ocupado a esa hora.")
									}
									else
										println("Error, el salon esta deshabilitado");
								}
							}
							if(paso == false)
								println("Error, el salon introducido no existe");
						}
					}
					else{
						break = false;
						println("Has cerrado sesion");
					}
				}
				if(entrar == false)
					println("Error de codigo.");
			}
			else
				breakmain = false;
		}
		else{
			println("Por favor inserta un digito valido");
		}
	}
}