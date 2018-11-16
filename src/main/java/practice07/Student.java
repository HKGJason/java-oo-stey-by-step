package practice07;



public class Student extends Person{
	private Klass klass;
	public Student(String _name, int _age, Klass _klass) {
		super(_name, _age);
		this.klass = _klass;
	}
	
	public Klass getKlass() {
		return klass;
	}
	
	public String introduce() {
		return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I am at Class "+klass.getNumber()+".";
	}
}