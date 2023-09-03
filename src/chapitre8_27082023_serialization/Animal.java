package chapitre8_27082023_serialization;

import java.io.Serializable;

public class Animal implements Serializable{
	/*
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char type;
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	public Animal(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getType() {
		return type;
	}
	
	*/
	private static final long serialVersionUID = 2L;
	private transient String name;
	private transient int age;
	private static char type='C';
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	{
		this.age = 14;
	}
	public Animal() {
		this.name = "Unknown";
		this.age = 10;
		this.type = 'Q';
	}
	
	public Animal(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getType() {
		return type;
	}
	

}
