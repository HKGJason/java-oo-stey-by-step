package practice07;


public class Teacher extends Person{
	private Klass klass;
	public Teacher(String name, int age) {
		super(name,age); 
	}
	public Teacher(String name, int age, Klass _klass) {
		super(name,age);
		this.klass = _klass;
	}
	public String introduce() {
		if (klass.getNumber() == 0) { 
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach No Class.";
		}else {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach Class "+klass+".";
		}
	}
	public String introduceWith(Student student) {
		if (student.getClass().equals(klass)) {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
		}else {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
		}
		
	}
}
