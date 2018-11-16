package practice10;



public class Klass {
	private int klass = 0;
	private Student student;
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
	public void assignLeader(Student _student) {
		if (student.equals(_student))
			this.leader = student;
		else
			System.out.println("It is not one of us.");
	}
	public Student getLeader() {
		return leader;
	}
	public void appendMember(Student _student) {
		this.student= _student;
	}
}

