package com.example.model;

public class DaneOsobowe {
	private String imie;
	private String nazwisko;
	private String login;
	private String haslo;
	
	public DaneOsobowe(String i, String n, String h, String l) {
		setImie(i);
		setNazwisko(n);
		setLogin(l);
		setHaslo(h);
	}
	
	public void setImie(String n) {
		this.imie = n;
	}
	
	public void setNazwisko(String n) {
		this.nazwisko = n;
	}
	
	public void setLogin(String n) {
		this.login = n;
	}
	
	public void setHaslo(String n) {
		this.haslo = n;
	}
	
	public String getImie() {
		return this.imie;
	}
	
	public String getNazwisko() {
		return this.nazwisko;
	}
	
	public String getHaslo() {
		return this.haslo;
	}
	
	public String getLogin() {
		return this.login;
	}
}
