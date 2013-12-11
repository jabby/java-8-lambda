package fr.jabbytechs.lambda;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.jabbytechs.lambda.factory.PersonFactory;

public class TestLambda {

	private static final int numberOfPersons = 5_000_000;
	private static List<Person> persons = new ArrayList<>();

	@BeforeClass
	public static void beforeClass() {
		persons.addAll(PersonFactory.buildPersonList(numberOfPersons));
	}

	@AfterClass
	public static void afterClas() {
		persons = null;
	}

	@Test
	public void sommeAgePersonne() {
		int somme = persons.stream()
				.mapToInt(p -> p.getAge())
				.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println("Somme des ages des personnes de la liste : " + somme);
	}
	
	@Test
	public void sommeAgePersonneAuPlus20() {
		int somme = persons.stream()
				.mapToInt(p -> p.getAge())
				.filter(a -> a <= 20)
				.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println("Somme des ages des personnes au plus 20 ans sans parallellisme : " + somme);
	}
	
	
	@Test
	public void sommeAgePersonnePlus20() {
		int somme = persons.stream()
				.mapToInt(p -> p.getAge())
				.filter(a -> a > 20)
				.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println("Somme des ages des personnes de plus de 20 ans sans parallellisme : " + somme);
	}
	
	@Test
	public void sommeAgePersonnePlus20Parrallel() {
		int somme = persons.parallelStream()
				.mapToInt(p -> p.getAge())
				.filter(a -> a > 20)
				.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println("Somme des ages des personnes de plus de 20 ans sans parallellisme : " + somme);
	}
}
