package br.edu.fatecpg.abstracao.model;

public class Girafa {
	public String nome;
	public String raça;
	public float tamanho;

public Girafa (String nome ,String raça, float tamanho ) {
	this.nome = nome;
	this.raça = raça;
	this.tamanho = tamanho;
}
public void comer() {
	System.out.println("Comendo...");
}
public void andar() {
	System.out.println("Andando...");
}
public void acasalar() {
	System.out.println("Acasalando...");
}
}