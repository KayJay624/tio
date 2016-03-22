package com.example.model;

import java.util.ArrayList;

public class EkspertPiwny {
	public ArrayList<String> getMarki(String kolor) {
		ArrayList marki = new ArrayList();
		
		if (kolor.equals("bursztynowy")) {
			marki.add("Lech");
			marki.add("Zywiecec");
		
		} else if(kolor.equals("ciemny")) {
			marki.add("Tyskie");
			marki.add("Carlsberg");
		
		} else {
			marki.add("Haineken");
		}
		
		return marki;
	}

}
