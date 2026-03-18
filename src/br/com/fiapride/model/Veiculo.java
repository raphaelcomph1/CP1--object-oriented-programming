
package br.com.fiapride.model;  


//primeiro defina eles como privado 
//deixei claro as variaveis para melhor leitura (pl para placa)
// defini tudo relacionado a gasolina em double para uma padronizacao do conteudo 

public class Veiculo {
	private String individuo;
	private String placa;
	private double gasolina;
	

	public Veiculo( String individuo, String placa, double gasolinaAtual){
		this.setIndividuo(individuo);
		this.setPlaca(placa); 
		this.setGasolina(gasolinaAtual); 
	}

// defini o set e o get dos metodos (encapsulamento, blindando as informacoes)

	public void adicionarViagem(double litrosGasto) {
		if (gasolina <= 0) {
            System.out.println("Erro: A quantidade de gasolina inválida.");
            return;
        }
        this.gasolina += litrosGasto;
        System.out.println("Sua Gasolina foi alterada: " + this.gasolina + "L");
    }
	
// afim de evitar confusao mudei a varivael v para litrosgasto
	
	public void gastoViagem(double litrosGasto) {   //padrao dos valores, se adicionar é int o gastar precisa manter o padrao 
		if (gasolina <= 0) {
            System.out.println("Erro: A quantidade de gasolina inválida.");
            return;
        }
		if (this.gasolina < litrosGasto) {
            System.out.println("Erro: Gasolina insuficiente.");
            return;
		}
        this.gasolina -= litrosGasto;
        System.out.println("Gasto realizado. Restam: " + this.gasolina + "L Gasolina atual");
	}
	
	public String getIndividuo() {
		return this.individuo;
	}

	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}
	
	public String getPlaca() {
		return this.placa;
	}

	private void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public double getGasolina() {
		return this.gasolina;
	}
	
	private void setGasolina(double gasolinaAtual) {
    	if (gasolinaAtual >= 0) {
            this.gasolina = gasolinaAtual;
        } else {
            System.out.println("Quantidade de gasolina invalidada!");
        }
    }

}
