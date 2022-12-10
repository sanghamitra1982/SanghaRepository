package Package1;

public class ConstructorAssignment {
	public ConstructorAssignment() {
		this(10,20,30);
		System.out.println("Dafault Constructor");
	}
	public ConstructorAssignment(int a) {
		this();
		System.out.println("One parameterized Constructor");
	}
	public ConstructorAssignment(int a, int b) {
		this(10);
		System.out.println("Two parameterized Constructor");
	
	}
	public ConstructorAssignment(int a, int b, int c) {
		System.out.println("Three parameterized Constructor");
	}
	public ConstructorAssignment(int a, int b, int c, int d) {
		this(10,20);
		System.out.println("Four Parameterized Constructor");
	}
public static void main(String[] args) {
	ConstructorAssignment ref=new ConstructorAssignment(10,20,30,40);
	
}
}
