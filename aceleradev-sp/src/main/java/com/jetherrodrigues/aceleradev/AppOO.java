package com.jetherrodrigues.aceleradev;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class AppOO {
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	public static void main(String[] args) {
		pessoas.add(new Pessoa("Jether Rois", "Lorena", 36));
		pessoas.add(new Pessoa("Gustavo", "Campinas", 29));
		pessoas.add(new Pessoa("André", "SP", 27));
		pessoas.add(new Pessoa("Donato", "Praia Grande", 24));
		
		System.out.println(pessoas);
		System.out.println();
		
		pessoas.parallelStream().filter(p -> p.getIdade() > 30).forEach(System.out::println);
		System.out.println();
		
		List<Pessoa> listaDinamicaPessoasMaior25anos = AppOO.criaNovaLista(p -> p.getIdade() > 25);
		System.out.println(listaDinamicaPessoasMaior25anos);
		System.out.println();
		
		List<Pessoa> listaDinamicaPessoasDeSalvador = AppOO.criaNovaLista(p -> "Lorena".equals(p.getCidade()));
		System.out.println(listaDinamicaPessoasDeSalvador);
		System.out.println();
		
		List<Pessoa> listaDinamicaPessoasDeCampinas = AppOO.criaNovaLista(new Predicate<Pessoa>() {
			@Override
			public boolean test(Pessoa p) {
				return "Campinas".equals(p.getCidade());
			}
		});
		System.out.println(listaDinamicaPessoasDeCampinas);
		System.out.println();
				
	}
	
	private static List<Pessoa> criaNovaLista(Predicate<Pessoa> test) {
		return pessoas.stream().filter(test).map(p -> p).collect(Collectors.toList());		
	}
}
