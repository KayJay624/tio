package com.example.tags;

import java.math.BigDecimal;
import java.util.ResourceBundle;

public class ZamianaWalut {
	public static java.lang.String zamienWalute(java.lang.String warWej, java.lang.String walWej, String walWyj) {
		double wartosc = Double.parseDouble(warWej);
		
		ResourceBundle resource = ResourceBundle.getBundle("test");
		double walutaWej = Double.parseDouble(resource.getString(walWej));
		double walutaWyj = Double.parseDouble(resource.getString(walWyj));
		
		double result = wartosc*walutaWej/walutaWyj;
		BigDecimal bd = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP);
		
		return warWej +" " +walWej + " to: " + bd + " " +walWyj;
	}
}
