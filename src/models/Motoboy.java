package models;

public class Motoboy {
	//========== criação de atributos ==========
	private String name, moto;

	//========== construtor ==========
	public Motoboy(String name, String moto) {
		this.name = name;
		this.moto = moto;
	}
	
	//========== getters e setters ==========
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