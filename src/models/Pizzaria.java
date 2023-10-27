package models;

import java.util.ArrayList;

public class Pizzaria {
	//criação de atributos
	private String name;

	//criação de uma array para as diferentes pizzas
	ArrayList<Pizza> pizzas = new ArrayList<>();
	
	//criação de uma array para os diferentes motoboys
	ArrayList<Motoboy> motoboys = new ArrayList<>();
	
	//getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//gerando constructor para a adição de pizzas
	public void AddPizza(Pizza pizza) {
		
	}
	
	//gerando constructor para a adição de motoboys
	public void AddMotoboy(Motoboy motoboy) {
		
	}
	

}
