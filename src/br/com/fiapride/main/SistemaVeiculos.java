package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;


// passei as informacoes de forma mais limpa com uma linha de codigo
public class SistemaVeiculos{
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 100.0);
		System.out.println("A Gasolina atual aumentado");
		v1.adicionarViagem(50.0);
		v1.gastoViagem(100.0);
		System.out.println("Seu carro possui "+ v1.getGasolina() + "L de gasolina");
		System.out.println("Dono: "+ v1.getIndividuo() + "| Placa: " + v1.getPlaca() + "| Gasolina: " + v1.getGasolina()+"L");
	}
	
}
