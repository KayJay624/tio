package com.example.faces;

import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;

@ManagedBean(name="dane")
@SessionScoped
public class Dane {
	private String imie;
	private String mail;
	private String kod;
	private String wiek;
	private String plec;
	private String wyksztalcenie;	
	private String rozmiar;
	private String p1;
	private String[] p2;
	private String p3;
	private String[] p4;
	private String[] p5;
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	private HtmlSelectBooleanCheckbox nowy; 
	private int counter = 0;
	private boolean reklama = Math.random() > 0.1;
	
	public String dalej() {
		if(nowy.isSelected()) {
			return "wspolneNowi";
		} else {
			return badanie();
		}
		
	}
	
	public String podsumowanie() {
		return "podsumowanie";
	}
	
	public String badanie() {
		if(plec.equals("kobieta")){
			return "badanieKobiety";			
		} else {
			return "badanieMezczyzna";
		}
	}
	
	
	/*public boolean isWyswietlReklame() {
		return wyswietlReklame;
	}

	public void setWyswietlReklame(boolean wyswietlReklame) {
		this.wyswietlReklame = wyswietlReklame;
	}*/
	
	public boolean wyswietlReklame() {
		boolean tmp = reklama;
		this.reklama = Math.random() > 0.1;
		return tmp;
	}
	
	public boolean isReklama() {
		this.reklama = Math.random() > 0.1;
		return reklama;
	}

	public void setReklama(boolean wyswietlReklame) {
		this.reklama = wyswietlReklame;
	}

	public String inc() {
		this.counter++;
		return null;
	}
	
	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public HtmlSelectBooleanCheckbox getNowy() {
		return nowy;
	}

	public void setNowy(HtmlSelectBooleanCheckbox nowy) {
		this.nowy = nowy;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public String getB2() {
		return b2;
	}

	public void setB2(String b2) {
		this.b2 = b2;
	}

	public String getB3() {
		return b3;
	}

	public void setB3(String b3) {
		this.b3 = b3;
	}

	public String getB4() {
		return b4;
	}

	public void setB4(String b4) {
		this.b4 = b4;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	
	
	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String[] getP2() {
		return p2;
	}

	public void setP2(String p2[]) {
		this.p2 = p2;
	}
	
	public String getP2asString() {
		return Arrays.toString(p2);
	}
	
	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String[] getP4() {
		return p4;
	}

	public void setP4(String p4[]) {
		this.p4 = p4;
	}
	
	public String getP4asString() {
		return Arrays.toString(p4);
	}
	
	public String[] getP5() {
		return p5;
	}

	public void setP5(String p5[]) {
		this.p5 = p5;
	}
	
	public String getP5asString() {
		return Arrays.toString(p5);
	}
	
	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getWyksztalcenie() {
		return wyksztalcenie;
	}

	public void setWyksztalcenie(String wyksztalcenie) {
		this.wyksztalcenie = wyksztalcenie;
	}

	public String getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(String rozmiar) {
		this.rozmiar = rozmiar;
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

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}	
}
