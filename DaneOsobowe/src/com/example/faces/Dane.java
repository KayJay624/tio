package com.example.faces;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="dane")
public class Dane {
	private String imie;
	private String nazwisko;
	private String wiek;
	private String plec;
	private String wojewodztwo;
	
	private  HtmlSelectOneMenu wojewodztwoCheck = null;
	private  HtmlCommandButton wyslijButton;
	
	public HtmlSelectOneMenu getWojewodztwoCheck() {
		return wojewodztwoCheck;
	}
	public void setWojewodztwoCheck(HtmlSelectOneMenu acceptCheckbox) {
		this.wojewodztwoCheck = acceptCheckbox;
	}
	public HtmlCommandButton getWyslijButton() {
		return wyslijButton;
	}
	public void setWyslijButton(HtmlCommandButton wyslijButton) {
		this.wyslijButton = wyslijButton;
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
	public String getWojewodztwo() {
		return wojewodztwo;
	}
	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}
	
	public String wyslij() {
		return "wyniki";
	}
	
	public void activateButton(ValueChangeEvent e) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.renderResponse(); 
		
		if (wojewodztwoCheck != null)
			wyslijButton.setDisabled(false);
		else
			wyslijButton.setDisabled(true);
	 }


}
