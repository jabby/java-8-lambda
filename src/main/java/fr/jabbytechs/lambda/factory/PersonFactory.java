package fr.jabbytechs.lambda.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import fr.jabbytechs.lambda.Person;

public class PersonFactory {

	private static final int LOW = 12;
	private static final int HIGH = 80;
	private static final Random random = new Random();

	/**
	 * Retourne une liste de personnes
	 * 
	 * @param number
	 *            nombre de personnes souhaitées
	 * @return La liste construite
	 */
	public static List<Person> buildPersonList(int number) {
		List<Person> persons = new ArrayList<>();
		while (number > 0) {
			number--;
			persons.add(buildPerson());
		}
		return persons;
	}

	private static Person buildPerson() {
		Person person = new Person();
		person.setAge(random.nextInt(HIGH - LOW) + LOW);
		person.setFirstname(RandomStringUtils.random(20));
		person.setName(RandomStringUtils.random(20));
		person.setGender(random.nextInt(2) == 0 ? Person.Sex.MALE
				: Person.Sex.FEMALE);
		return person;
	}
}
