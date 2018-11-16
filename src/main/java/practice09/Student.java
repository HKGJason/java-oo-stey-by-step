package practice09;


public class Student extends Person{
	private Klass klass;
	public Student(int id, String _name, int _age, Klass _klass) {
		super(id, _name, _age);
		this.klass = _klass;
	}
	
	public Klass getKlass() {
		return klass;
	}
	
	public String introduce() {
		if (klass.getLeader().equals(this)) {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I am Leader of Class "+klass.getNumber()+".";
		}else {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I am at Class "+klass.getNumber()+".";
		}
	}
}