package practice08;

public class Klass {
	private int klass = 0;
	private Student leader;
	public Klass(int _klass) {
		this.klass = _klass;
	}
	public int getNumber() {
		return klass;
	}
	public String getDisplayName() {
		return "Class "+klass;
	}
	public void assignLeader(Student student) {
		this.leader = student;
	}
	public Student getLeader() {
		return leader;
	}
}
