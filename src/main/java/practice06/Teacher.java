package practice06;

public class Teacher extends Person{
	private int klass = 0;
	public Teacher(String name, int age) {
		super(name,age); 
	}
	public Teacher(String name, int age, int _klass) {
		super(name,age);
		this.klass = _klass;
	}
	public String introduce() {
		if (klass == 0) { 
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach No Class.";
		}else {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach Class "+klass+".";
		}
	}
}
