package com.example.beans;

import java.util.Random;

public class ZagadkaBean implements java.io.Serializable {
	private int zagadka = 15;
	private int proby = 0;
	
	public void init() {
		Random r = new Random();
		this.zagadka = r.nextInt(100);
	}
	
	public ZagadkaBean() {
		/*Random r = new Random();
		this.zagadka = r.nextInt(100);*/
	}

	public void incProby() {
		this.proby++;
	}
	
	public int getZagadka() { 
		return zagadka; 
	}
	
	public void setZagadka(int zagadka) {
		this.zagadka = zagadka;
	}

	public int getProby() { 
		return proby; 
	}
	
	public void setProby(int prob) {
		this.proby = prob;
	}
	
	public void reset() {
		this.proby = 0;
	}
}