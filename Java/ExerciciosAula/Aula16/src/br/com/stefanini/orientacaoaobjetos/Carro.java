package br.com.stefanini.orientacaoaobjetos;

public abstract class Carro {
	/*
	 * Modificadores de acesso
	 * default = sem palavra chave, Acess�vel na pr�pria classe ou classe de um mesmo pacote
	 * public = acess�vel na pr�pria classe, classe mesmo pacote, subclasse(extends), todas demais classes
	 * private = acess�vel na propria classe
	 * protected = acess�vel na pr�pria classe, classe mesmo pacote e subclasse(extends)
	*/
	
	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;
	
	public Carro() {
		System.out.println("Construindo um Carro...");
	}
	
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Acelerando......");
	}
	
	public void frear() {
		System.out.println("Freando.........");
	}
	
	public abstract void piscarAlerta();
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial)/(tempoFinal - tempoInicial) * 3.6;
	}
	
	public String calcularTaxaAceleracao(int velocidadeFinal,int tempoFinal) {
		return "" +(velocidadeFinal - 0)/(tempoFinal - 0) * 3.6;
	}
	
	public double calcularTaxaAceleracao(double velocidadeFinal,double tempoFinal) {
		return (velocidadeFinal - 0)/(tempoFinal - 0) * 3.6;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		if(velocidadeMaxima < 0) {
			System.out.println("Valor inv�lido");
		}else {
			this.velocidadeMaxima = velocidadeMaxima;
		}
	}

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}

	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
	
}
