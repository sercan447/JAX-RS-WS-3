package com.yazilim.servisler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="soner")
@XmlAccessorType(XmlAccessType.FIELD)
public class Soner {
	
	@XmlElement
	private String ad;
	@XmlElement
	private String soyad;
	
	public Soner() {
		
	}
	
	
	public Soner(String ad, String soyad) {
		
		this.ad = ad;
		this.soyad = soyad;
	}


	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
	

}
