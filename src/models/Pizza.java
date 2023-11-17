package models;

public class Pizza {
	//========== criação de atributos ==========
	private String flavors;
	private double price;
	
	//========== constructor ==========
	public Pizza(String flavors, double price) {
		this.flavors = flavors;
		this.price = price;
	}
	
	//========== getters e setters ==========
	public String getFlavors() {
		return flavors;
	}
	public void setFlavors(String flavors) {
		this.flavors = flavors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isEmpty() {
		return false;
	}
	
}