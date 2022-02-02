package Projeto_BootCamp;

public class Cursos extends Conteudo {
	
	private int cargaHoraria;
	
	
	public Cursos() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Cursos [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
}
