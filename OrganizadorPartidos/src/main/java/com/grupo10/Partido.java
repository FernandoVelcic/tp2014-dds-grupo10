package com.grupo10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Partido {
	List<Participante> participantes = new ArrayList<Participante>();
	Date diaYhora;
	
	Equipo equipo1;
	Equipo equipo2;
	
	public Partido(Date diaYhora) {
		this.diaYhora = diaYhora;
	}

	public boolean inscribirJugadorEstandar(Jugador jugador) {
		return inscribirJugador(jugador, 1);
	}

	public boolean inscribirJugadorCondicional(Jugador jugador) {
		return inscribirJugador(jugador, 2);
	}
	
	public boolean inscribirJugadorSolidario(Jugador jugador) {
		return inscribirJugador(jugador, 3);
	}
	
	public boolean inscribirJugador(Jugador jugador, int prioridadModalidad) {
		if(calcularConfirmados() > 10)
			return false;
	
		participantes.add(new Participante(jugador, prioridadModalidad));
		
		return true;
	}
	
	public Stream<Participante> obtenerConfirmados() {
		return participantes.stream().filter(p -> p.prioridadModalidad == 1);
	}

	public int calcularConfirmados() {
		return (int) obtenerConfirmados().count();
	}

	public void GenerarEquipos() {
		// TODO Auto-generated method stub
	}

	public void ConfirmarEquipos() {
		// TODO Auto-generated method stub
	}
}
