package practice05;


public class Worker extends Person{
	public Worker(String _name, int _age) {
		super(_name, _age);
	}
	public String introduce() {
		return "My name is "+super.getName()+". I am "+super.getAge()+" years old. I am a Worker. I have a job.";
	}
}