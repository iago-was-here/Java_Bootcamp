package PooModel;

public class Pessoa {
	
	public enum TipoPessoa{fisica, juridica};
	
	public Integer cod;
	public String nome;
	public String documento;
	public TipoPessoa tipo;
}
