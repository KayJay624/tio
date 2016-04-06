package com.example.faces;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="dane")
@SessionScoped
public class Dane {	
	//public List<Waluta> walutaList;
	public Waluta[] walutaList;
	public String walutaZ = "PLN";
	public String walutaNa = "EUR";
	public String kwota;
	public String nowaWaluta;
	public String nowaKurs;
	
	public Dane() {
		this.walutaList = new Waluta[3];
		walutaList[0] = new Waluta("PLN", "PLN", "1");
		walutaList[1] = new Waluta("USD", "USD", "3.81");
		walutaList[2] = new Waluta("EUR", "EUR", "4.23");
	}
	
	public String przelicz() {
		return "przeliczone";
	}
	
	public String dodaj() {
		Waluta[] nowa = new Waluta[walutaList.length+1];
		
		for(int i = 0; i < walutaList.length; i++) {
			nowa[i] = walutaList[i];
		}
		nowa[walutaList.length] = new Waluta(nowaWaluta, nowaWaluta, nowaKurs);
		
		this.walutaList = nowa;
		return "index";
	}
	
	public String przeliczaj() {
		double wp = Double.parseDouble(getWaluta("PLN").val);
		double w1 = Double.parseDouble(getWaluta(walutaZ).val);
		double w2 = Double.parseDouble(getWaluta(walutaNa).val);
		double k = Double.parseDouble(kwota);
		
		double val = (w1 * k * wp) / w2;
		double valRounded = new BigDecimal(val).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return "" + valRounded ;
	}
		
	public Waluta[] getWalutaList() {
		//this.walutaList = new Waluta[3];
		//walutaList[0] = new Waluta("PLN", "PLN", "1");
		//walutaList[1] = new Waluta("USD", "USD", "3.81");
		//walutaList[2] = new Waluta("EUR", "EUR", "4.23");
		
		return walutaList;
	}

	public void setWalutaList(Waluta[] walutaList) {
		this.walutaList = walutaList;
	}
	
	
	
	public String getNowaWaluta() {
		return nowaWaluta;
	}

	public void setNowaWaluta(String nowaWaluta) {
		this.nowaWaluta = nowaWaluta;
	}

	public String getNowaKurs() {
		return nowaKurs;
	}

	public void setNowaKurs(String nowaKurs) {
		this.nowaKurs = nowaKurs;
	}

	public String getKwota() {
		return kwota;
	}

	public void setKwota(String kwota) {
		this.kwota = kwota;
	}

	public String getWalutaZ() {
		return walutaZ;
	}

	public void setWalutaZ(String walutaZ) {
		this.walutaZ = walutaZ;
	}

	public String getWalutaNa() {
		return walutaNa;
	}

	public void setWalutaNa(String walutaNa) {
		this.walutaNa = walutaNa;
	}
	
	private Waluta getWaluta(String wal) {
		for(Waluta w : walutaList){
			if(w.walutaLabel.equals(wal)) {
				return w;
			}
		}
		
		return null;
	}
	
}
