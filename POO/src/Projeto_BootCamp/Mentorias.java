package Projeto_BootCamp;

import java.time.LocalDate;

public class Mentorias extends Conteudo {
	
	private LocalDate data;
	
	public Mentorias() {
		
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentorias [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", data=" + data + "]";
	}

	@Override
	public double calcularXp() {
		return  XP_PADRAO + 20d;
	}
}
