package com.dio;

public class objeto {

	public static void main(String[] args) {
		
		Carro() {

	    }

	    Carro(String cor, String modelo, int capacidadeTanque) {
	        this.cor = cor;
	        this.modelo = modelo;
	        this.capacidadeTanque = capacidadeTanque;
	    }

	    void setCor(String cor) {
	        this.cor = cor;
	    }

	    String getCor() {
	        return cor;
	    }

	    void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    String getModelo() {
	        return modelo;
	    }

	    void setCapacidadeTanque(int capacidadeTanque) {
	        this.capacidadeTanque = capacidadeTanque;
	    }

	    int getCapacidadeTanque() {
	        return capacidadeTanque;
	    }

	    double totalValorTanque(double valorCombustivel) {
	        return capacidadeTanque * valorCombustivel;
	    }
	}

	}

}
