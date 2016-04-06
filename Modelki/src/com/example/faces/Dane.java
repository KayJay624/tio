package com.example.faces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="dane")
@SessionScoped
public class Dane {
	private String imie;
	private String nazwisko;
	private String adres;
	private String telefon;
	private String mail;
	private String wiek;
	private String waga;
	private String wzrost;
	private String wlosy;
	private String oczy;
	private String ubranie;
	private String buty;
	private String doswiadczenie;
	private String plec;
	
	private String biust;
	private String miseczka;
	private String talia;
	private String biodra;
	private String noga;
	private String klatka;
	private String pas;
		
	public String dalej() {
		if(this.plec.equals("kobieta")){
			return "kobieta";			
		} else {
			return "mezczyzna";
		}
	}
	
	public String wyslij() {
		return "podsumowanie";
	}
	
	
	
	public String getBiust() {
		return biust;
	}

	public void setBiust(String biust) {
		this.biust = biust;
	}

	public String getMiseczka() {
		return miseczka;
	}

	public void setMiseczka(String miseczka) {
		this.miseczka = miseczka;
	}

	public String getTalia() {
		return talia;
	}

	public void setTalia(String talia) {
		this.talia = talia;
	}

	public String getBiodra() {
		return biodra;
	}

	public void setBiodra(String biodra) {
		this.biodra = biodra;
	}

	public String getNoga() {
		return noga;
	}

	public void setNoga(String noga) {
		this.noga = noga;
	}

	public String getKlatka() {
		return klatka;
	}

	public void setKlatka(String klatka) {
		this.klatka = klatka;
	}

	public String getPas() {
		return pas;
	}

	public void setPas(String pas) {
		this.pas = pas;
	}

	public String getWaga() {
		return waga;
	}

	public void setWaga(String waga) {
		this.waga = waga;
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getWiek() {
		return wiek;
	}

	public void setWiek(String wiek) {
		this.wiek = wiek;
	}

	public String getWzrost() {
		return wzrost;
	}

	public void setWzrost(String wzrost) {
		this.wzrost = wzrost;
	}

	public String getWlosy() {
		return wlosy;
	}

	public void setWlosy(String wlosy) {
		this.wlosy = wlosy;
	}

	public String getOczy() {
		return oczy;
	}

	public void setOczy(String oczy) {
		this.oczy = oczy;
	}

	public String getUbranie() {
		return ubranie;
	}

	public void setUbranie(String ubranie) {
		this.ubranie = ubranie;
	}

	public String getButy() {
		return buty;
	}

	public void setButy(String buty) {
		this.buty = buty;
	}

	public String getDoswiadczenie() {
		return doswiadczenie;
	}

	public void setDoswiadczenie(String doswiadczenie) {
		this.doswiadczenie = doswiadczenie;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}	
}
