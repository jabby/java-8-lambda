package fr.jabbytechs.lambda.factory;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.jabbytechs.lambda.Person;

public class PersonFactoryTest {
	@Test
	public void testBuildPersonList() {
		int numberOfPersons = 1_000_000;
		List<Person> persons = PersonFactory.buildPersonList(numberOfPersons);
		Assert.assertEquals(numberOfPersons, persons.size());
	}
}
