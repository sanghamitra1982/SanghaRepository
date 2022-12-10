package Package1;

public class ArithmeticB {
	public int multiplication(int a, int b) {
		int multiplication=a*b;
		System.out.println("mul is (10*2)="+multiplication);
		return multiplication;
		
	}
	public int sub(int c, int d) {
		int sub = c-d;
		System.out.println("sub is ((10*2)-2)="+sub);
		return sub;
	}
   public int add(int e, int f) {
	   int add=e+f;
	   System.out.println("add  is (((10*2)-2)+2)="+add);
	   return add;
   }
   public int sub1(int g, int h) {
	   int sub1=g-h;
	   System.out.println("subagain is ((((10*2)-2)+2)-2)="+sub1);
	   return sub1;
   }
   public static void main(String[] args) {
	   
	   ArithmeticB result= new ArithmeticB();
	  int  result1= result.multiplication(10, 2);
	   int result2= result.sub(result1, 2);
	   int result3= result.add(result2, 2);
	   int result4= result.sub1(result3, 2);
System.out.println("Final result is "+result4/2);
}
}
