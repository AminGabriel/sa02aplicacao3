package com.conversordetemperatura;

public class Usuario {

	public double c;
	public double f;
	public double k;
	public int numero;
	// Construtor
	public Usuario() {
		// TODO Auto-generated constructor stub
		
	}
    
	// Métodos
	
	// Escolha celcius
	public double celciusparakelvin(double conversao) {
		this.k = (conversao + 273.15);
		return this.k;
	}
	public double celciusparafahrenheit(double conversao) {
		this.f = (conversao * 9/5) + 32;
		return this.f;
	}
	
	// Escolha kelvin
	public double kelvinparacelcius(double conversao) {
		this.c = (conversao - 273.15);
		return this.c;
	}
	public double kelvinparafahrenheit(double conversao) {
		this.f = (conversao - 273.15) * 9/5 + 32;
		return this.f;
	}
	
	// Escolha farenheit
	public double fahrenheitparakelvin(double conversao) {
		this.k = (conversao - 32) * 5/9 + 273.15;
		return this.k;
	}
	public double fahrenheitparacelcius(double conversao) {
		this.c = (conversao - 32) * 5/9;
		return this.c;
	}

}
