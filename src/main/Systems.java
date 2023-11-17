package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Motoboy;
import models.Pizza;
import models.Pizzaria;
import models.PizzariaManagement;

public class Systems {
	public static void main(String[] args) {
		boolean continuar = true;
		// instânciando um objeto da classe PizzariaManagement
		PizzariaManagement pizzaManegement = new PizzariaManagement();
		Pizzaria pizzari = new Pizzaria();

		do {
			// ======= criando e exibindo um menu de opções inicial =======
			String[] options = { "Pizzarias", "Cancelar" };
			int opcoes = JOptionPane.showOptionDialog(null, "Selecione uma das opções abaixo:",
					"ʕ•́ᴥ•̀ʔっ MENU",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			// ======== verificando a opção escolhida e determinando sua continuidade
			if (opcoes == 0) {
				// segundo menu de opções
				String[] options2 = { "Adicionar Pizzaria", "Ver lista", "Gerenciar Pizzaria", "Cancelar" };
				int opcoes2 = JOptionPane.showOptionDialog(null, "Selecione uma das opções abaixo:","ʕ•́ᴥ•̀ʔっ MENU PIZZARIAS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);

				// ======== verificando a opção escolhida e determinando sua continuidade
				// primeiro caso: adicionar pizzarias
				if (opcoes2 == 0) {
					String brandPizzaria = JOptionPane.showInputDialog("Digite o nome de sua nova pizzaria: ");
					Pizzaria newBrand = new Pizzaria();
					newBrand.setBrand(brandPizzaria);
					pizzaManegement.AddPizzaria(newBrand);
					// segundo caso: listar as pizzarias
				} else if (opcoes2 == 1) {
					pizzaManegement.ListPizzaria();
					// terceiro caso: gerenciar pizzarias
				} else if (opcoes2 == 2) {
					int codigoSelected;
					ArrayList<Pizzaria> pizzarias = pizzaManegement.getPizzarias();
					// StringBuilder é uma classe em Java que é utilizada para criar e
					// manipular[]strings de maneira eficiente, especialmente quando você precisa
					// concatenar muitas strings ou construir strings complexas.
					StringBuilder pizzariasString = new StringBuilder("🍕 Catálogo de Pizzarias 🍕 \n");
					//criação de variável para a enumeração começar no 1
					int count = 1;
					//for each usado para iterar sobre cada objeto Pizzaria na lista de pizzarias
					for (Pizzaria pizzaria : pizzarias) {
						//acrescentando um contador para numerar cada pizzaria na lista
						pizzariasString.append(count).append(". Nome: ").append(pizzaria.getBrand()).append("\n");
						count++;
					}
					//recebendo o codigo da pizzaria escolhida
					String codigo = JOptionPane.showInputDialog(null, pizzariasString.toString(),
							"🍕 Catálago de Pizzarias 🍕",
							JOptionPane.INFORMATION_MESSAGE);

					//verificando se o input não está vazio
					if (codigo != null && !codigo.isEmpty()) {
						try {
							//transformando o codigo que estava em String para int
							codigoSelected = Integer.parseInt(codigo) - 1;

							//verificando se a pizzaria do codigo existe na lista
							if (codigoSelected >= 0 && codigoSelected < pizzarias.size()) {
								//obtendo a lista de pizzarias e selecionando uma delas com base no codigo fornecido pelo usuário anteriormente
								Pizzaria pizzariaSelected = pizzaManegement.getPizzarias().get(codigoSelected);

								//caixa de diálogo com opções de ações
								String[] options3 = { "Adicionar Motoboy", "Adicionar Pizza", "Listar Motoboys",
										"Listar Pizzas", "Cancelar" };
								int opcoes3 = JOptionPane.showOptionDialog(null, "Selecione uma das opções abaixo:",
										"ヾ(＾∇＾) MENU PIZZARIA",
										JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3,
										options3[0]);

								//verificando a opção selecionada
								//adicionando motoboy
								if (opcoes3 == 0) {
									String nameMotoboy = JOptionPane.showInputDialog("Digite o nome do motoboy: ");
									String motoMotoboy = JOptionPane.showInputDialog("Digite a moto do motoboy: ");
									Motoboy newMotoboy = new Motoboy(nameMotoboy, motoMotoboy);
									pizzariaSelected.AddMotoboy(newMotoboy);

								//adicionando pizza
								} else if (opcoes3 == 1) {
									try {
										String flavourPizza = JOptionPane
												.showInputDialog("Digite o sabor da pizza: ");
										String priceString = JOptionPane
												.showInputDialog("Digite a preço da pizza: \n (no seguinte formato: 00.00) ");
										double pricePizza = Double.parseDouble(priceString);
										Pizza piza = new Pizza(flavourPizza, pricePizza);
										pizzariaSelected.AddPizza(piza);
									} catch (NumberFormatException e) {
										JOptionPane.showMessageDialog(null,
												"Valor inserido inválido. Tente novamente", "ERRO!",
												JOptionPane.WARNING_MESSAGE);
									}

								//listando motoboys
								} else if (opcoes3 == 2) {
									pizzariaSelected.ListMotoboy();

								//listando pizzas
								} else if (opcoes3 == 3) {
									pizzariaSelected.ListPizza();
								}
							}

						//se o valor da pizzaria não condizir com as especificações citadas (codigo != null && !codigo.isEmpty()), será exibida uma mensagem de erro
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"Valor inserido inválido. Tente novamente", "ERRO!",
									JOptionPane.WARNING_MESSAGE);
						}
					}

					// quarto caso: cancelar
				} else if (opcoes == 3) {
					continuar = false;
				}

			//cancelando a aplicação (fechando)
			} else if (opcoes == 1) {
				continuar = false;
			}

		} while (continuar);

	}

}