package com.example.model;

public class Film {
	private String tytul;
	private String rok;
	private String gatunek;
	private String dochod;
	
	public String getTytul() {
		return tytul;
	}
	public Film(String tytul, String gatunek, String rok, String dochod) {
		
		this.tytul = tytul;
		this.rok = rok;
		this.gatunek = gatunek;
		this.dochod = dochod;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getRok() {
		return rok;
	}
	public void setRok(String rok) {
		this.rok = rok;
	}
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	public String getDochod() {
		return dochod;
	}
	public void setDochod(String dochod) {
		this.dochod = dochod;
	}
}
