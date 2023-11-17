package models;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pizzaria {
	//========== criação de atributos ==========
	private String brand;

	//========== criação de arrays ==========
	//arrays para as diferentes pizzas disponíveis 
	ArrayList<Pizza> pizzas = new ArrayList<>();
	//arrays para os diferentes motoboys em serviço
	ArrayList<Motoboy> motoboys = new ArrayList<>();
	
	//========== getters e setters ==========
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//========== criação de constructors ==========
	//construtor para a adição de pizzas
	public void AddPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	//constructor para a adição de motoboys
	public void AddMotoboy(Motoboy motoboy) {
		motoboys.add(motoboy);
	}

	//constructor utilizado para a listagem de pizzas
	public void ListPizza(){
		if (pizzas.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Estamos sem pizzas quentinhas...", "Pizza", JOptionPane.WARNING_MESSAGE);
		} else {
			int count = 1;
			String message = "Pizzas encontradas!\n";
			for(Pizza pizza : pizzas) {
				message += count + ". Sabor: " + pizza.getFlavors() + "     Preço: " + pizza.getPrice();
				count++;
			}
			JOptionPane.showMessageDialog(null, message, "Pizzas", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	//constructor utilizado para a listagem de motoboys
	public void ListMotoboy(){
		if (motoboys.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Estamos sem motoboys disponíveis...", "Motoboy", JOptionPane.WARNING_MESSAGE);
		} else {
			int count = 1;
			String message = "Motoboys encontrados!\n";
			for(Motoboy motoboy : motoboys) {
				message += count + ". Nome: " + motoboy.getName() + "     Motocicleta: " + motoboy.getMoto();
				count++;
			}
			JOptionPane.showMessageDialog(null, message, "Motoboys", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}