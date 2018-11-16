package practice10;

import java.util.Iterator;
import java.util.LinkedList;

import practice11.Klass;
import practice11.Student;

public class Teacher extends Person{
	LinkedList<Klass> klass = new LinkedList<Klass>();
	public Teacher(int id, String name, int age) {
		super(id, name,age); 
	}
	public Teacher(int id, String name, int age, LinkedList<Klass> _klass) {
		super(id, name,age);
		this.klass = _klass;
	}
	public String introduce() {
		if (klass.size() == 0) { 
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach No Class.";
		}else {
			StringBuilder tmp = null;
			Iterator<Klass> itr = klass.iterator();
			int count = 0;
			while(itr.hasNext()) {
				if (count == 0) 
					tmp.append(itr.next().getNumber());
				else
					tmp.append(" ,"+itr.next().getNumber());
			}
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach Class "+tmp+".";
		}
	}
	public String introduceWith(Student student) {
		if (isTeaching(student)) {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
		}else {
			return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
		}
		
	}
	public boolean isTeaching(Student student) {
		Iterator<Klass> itr = klass.iterator();
		while(itr.hasNext()) {
			if (itr.next().equals(student.getKlass()))
					return true;
		}
		return false;
	}
}