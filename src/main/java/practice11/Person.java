package practice11;

public class Person {
	private String name;
	private int age;
	private int id;
	public Person(int _id, String _name, int _age) {
		this.id = _id;
		this.name = _name;
		this.age = _age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String introduce() {
		
		return "My name is "+name+". I am "+age+" years old.";
	}
}
