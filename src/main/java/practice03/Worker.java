package practice03;

public class Worker extends Person{
	public Worker(String _name, int _age) {
		super(_name, _age);
	}
	public String introduce() {
		return "I am a Worker. I have a job.";
	}
}
