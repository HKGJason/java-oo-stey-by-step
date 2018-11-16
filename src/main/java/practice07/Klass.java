package practice07;

public class Klass {
	private int klass = 0;
	public Klass(int _klass) {
		this.klass = _klass;
	}
	public int getNumber() {
		return klass;
	}
	public String getDisplayName() {
		return "Class "+klass;
	}
}
