package br.edu.fatecpg.operacaoMatematica.model;

public class Calculadora implements operacaoMatematica{

	@Override
	public double somar(double x, double y) {
		return x + y;
	}

	@Override
	public double subtrair(double x, double y) {
		return x - y;
	}

	@Override
	public double multiplicar(double x, double y) {
		return x * y;
	}

	@Override
	public double dividir(double x, double y) {
		return x / y;
	}

}
