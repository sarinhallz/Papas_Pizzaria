package models;

public class Motoboy {
	//criando atributos
	private String name, moto;

	//criando construtor
	public void Motoboy(String name, String moto) {
		this.name = name;
		this.moto = moto;
	}
	
	//gerando getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoto() {
		return moto;
	}

	public void setMoto(String moto) {
		this.moto = moto;
	}
	
}
