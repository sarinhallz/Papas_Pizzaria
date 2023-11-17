package models;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PizzariaManagement {
	//========== criação de array ==========
	//array para a armazenagem de diferentes pizzarias
	ArrayList<Pizzaria> pizzarias = new ArrayList<>();
	
	//========== criação de métodos ==========
	//método para a adição de pizzarias
	public void AddPizzaria(Pizzaria pizzaria) {
		pizzarias.add(pizzaria);
	}
	//método para a listagem de tais pizzaria
	public void ListPizzaria() {
		if (pizzarias.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Pizzarias não encontradas em sua localidade...", "Pizzarias", JOptionPane.WARNING_MESSAGE);
		} else {
			int count = 1;
			String message = "Pizzarias encontradas!\n";
			for(Pizzaria pizzaria : pizzarias) {
				message += count + ". Nome: " + pizzaria.getBrand() + "\n";
				count++;
			}
			JOptionPane.showMessageDialog(null, message, "Pizzarias", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	//método para retornar a lista de pizzarias
	public ArrayList<Pizzaria> getPizzarias() {
        return pizzarias;
    }

}