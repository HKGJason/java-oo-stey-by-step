package practice02;

public class Student extends Person{
	private int class_num;
	public Student(String _name, int _age, int _class) {
		super(_name, _age);
		this.class_num = _class;
	}
	
	public int getKlass() {
		return class_num;
	}
	
	public String introduce() {
		return "I am a Student. I am at Class "+class_num+".";
	}
}
