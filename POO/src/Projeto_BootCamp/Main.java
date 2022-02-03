package Projeto_BootCamp;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Cursos curso1 = new Cursos();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição");
		curso1.setCargaHoraria(8);
		
		Cursos curso2 = new Cursos();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentorias mentoria1 = new Mentorias();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição Mentoria");
		mentoria1.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(mentoria1);
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descrição bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Devs devIago = new Devs();
		devIago.setNome("Iago");
		devIago.inscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devIago.getConteudosInscritos());
		devIago.progredir();
		devIago.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos: " + devIago.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + devIago.getConteudosConcluidos());
		System.out.println("XP:" + devIago.calcularTotalXP());
		
		System.out.println("-----");
		
		Devs devMaria = new Devs();
		devMaria.setNome("Maria");
		devMaria.inscreverBootCamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteudos inscritos: " + devMaria.getConteudosInscritos());
		System.out.println("Conteudos concluidos: " + devMaria.getConteudosConcluidos());
		System.out.println("XP:" + devMaria.calcularTotalXP());
	}
}
