package fr.jabbytechs.lambda;

import java.util.List;

/**
 * @author jabberwock
 * 
 */
public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private String firstname;
	private Sex gender;
	private int age;

	public Person() {

	}

	public Person(String name, String firstname, Sex gender, int age) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.gender = gender;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the gender
	 */
	public Sex getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Sex gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", firstname=" + firstname
				+ ", gender=" + gender + ", age=" + age + "]";
	}
}