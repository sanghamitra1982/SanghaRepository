package Package1;

public class Student {
	int rollno;
	int age;
	
public void display1() {
	System.out.println("Welcome to all of you");
}

public void display2() {
	System.out.println("Student details: ");
}
public static void main(String[] args) {
	Student Sanghamitra = new Student();
	Sanghamitra.display1();
	Sanghamitra.display2();
	Sanghamitra.rollno=1234;
	Sanghamitra.age=23;
	System.out.println("Rollno is "+1234);
	System.out.println("age is "+23);
}
}
