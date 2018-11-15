package practice05;


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
		return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Student. I am at Class "+class_num+".";
	}
}