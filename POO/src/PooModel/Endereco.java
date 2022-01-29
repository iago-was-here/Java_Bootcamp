package PooModel;

public class Endereco {
	
	enum tipoEndereço{
		RESIDENCIAL, ENTREGA, TRABALHO
	}
	public String endereco, num, comp, cidade, bairro, estado, cep,cpf;
	public tipoEndereço tipo;
}
