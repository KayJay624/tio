package com.example.beans;

import java.util.Hashtable;

public class Koszyk {
	private Hashtable produkty;
	
	public Koszyk() {
        this.produkty = new Hashtable();
    }

    public void add(String produkt) {
        if (this.produkty.containsKey(produkt)) {
            Integer ilosc = (Integer)this.produkty.get(produkt);        
            this.produkty.put(produkt, new Integer(ilosc+1));
        
        } else {
            this.produkty.put(produkt, new Integer(1));
        }
    }

    public Hashtable getProdukty() {
        return this.produkty;
    }
    
    public int getSize() {
        return produkty.size();
    }

    public void setNewItem(String id_item) {
        this.add(id_item);
    }

    public void setRemoveItem(String id_item) {
        this.produkty.remove(id_item);
    }

}
