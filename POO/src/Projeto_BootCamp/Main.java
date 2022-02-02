package Projeto_BootCamp;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Cursos curso1 = new Cursos();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição");
		curso1.setCargaHoraria(8);
		
		Cursos curso2 = new Cursos();
		curso1.setTitulo("Curso JavaScript");
		curso1.setDescricao("Descrição");
		curso1.setCargaHoraria(10);
		
		Mentorias mentoria1 = new Mentorias();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição Mentoria");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(mentoria1);
		
	}
}
