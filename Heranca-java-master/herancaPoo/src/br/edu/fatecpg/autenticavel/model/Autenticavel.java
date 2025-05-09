package br.edu.fatecpg.autenticavel.model;

public interface Autenticavel {
	public boolean login(String usuario, String senha);
	public void logout();
}
