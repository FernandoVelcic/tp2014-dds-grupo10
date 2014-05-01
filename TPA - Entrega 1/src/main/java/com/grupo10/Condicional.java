package com.grupo10;

import java.util.List;

public class Condicional extends Inscripciones{
	public int cantidadMaximaJugadores;

	//Esta variable tendria que usarla en reemplazo de la variable de clase de partido. Para quitar los warnings
	public Condicional(int cantidad)
	{
		cantidadMaximaJugadores = cantidad;
	}

	public void agregarAlista(Jugadores unJugador, Partido unPartido)
	{
		if(laSumaEntreListaEstandarJugadoresYlistaCondicionalesEsIgual(unPartido)){
			//me fijo quien entro primero de los condicionales y lo saco
		}else{
			listaCondicionales.add(unJugador);
		}
	}
	
	public boolean laSumaEntreListaEstandarJugadoresYlistaCondicionalesEsIgual(Partido unPartido)
	{
		if(cantidadDeJugadoresEstandaresEn(unPartido)+cantidadDeJugadoresCondicionalesEn(unPartido) == unPartido.cantidadJugadoresXpartido)
			return true;
		return false;
	}
	
	public List<Jugadores> getLista()
	{
		return listaCondicionales;
	}
}