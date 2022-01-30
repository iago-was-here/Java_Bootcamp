package PooModel;

import java.util.ArrayList;

public class EntregaCartaoApp {
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco();
		endereco1.cep = "00000000000";
		
		Cliente cliente1 = new Cliente();
		
		cliente1.adicionaEndereco(endereco1);
		System.out.println("Adicionado com sucesso!");
	}
}
