package PooModel;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
	private List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereço mão pode ser nulo");
		}
		
		if(endereco.cep == null) {
			throw new NullPointerException("CEP mão pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
	private List<Endereco> getEnderecos(){
		if(enderecos == null) this.enderecos = new ArrayList<Endereco>();
		return enderecos;
	}
	
}
