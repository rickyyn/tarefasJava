package br.edu.fatecpg.autenticavel.model;

public class SistemadeSeguranca implements Autenticavel{
	
String log = "adm", pas = "123", y;

	@Override
	public boolean login(String usuario, String senha) {
		
		if(usuario.equals(log) && senha.equals(pas)) {
			return true;
			
		}else {
			return false;
		}
		
	}

	@Override
	public void logout() {
		System.out.println("Desconectado");
		
	}

}
