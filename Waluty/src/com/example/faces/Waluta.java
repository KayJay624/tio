package com.example.faces;

public class Waluta{
	public String walutaLabel;
	public String walutaValue;
	public String val;
	
	public Waluta(String walutaLabel, String walutaValue, String v){
		this.walutaLabel = walutaLabel;
		this.walutaValue = walutaValue;
		this.val = v;
	}
	
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public void setWalutaLabel(String walutaLabel) {
		this.walutaLabel = walutaLabel;
	}

	public void setWalutaValue(String walutaValue) {
		this.walutaValue = walutaValue;
	}

	public String getWalutaLabel(){
		return walutaLabel;
	}
	
	public String getWalutaValue(){
		return walutaValue;
	}
}