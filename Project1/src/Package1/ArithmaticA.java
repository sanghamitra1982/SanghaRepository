package Package1;

public class ArithmaticA {
	
 public int sum(int a, int b) {
	 int sum=a+b;
	 System.out.println("sum (10+2)="+sum);
	 return sum;
 }
 
 public int summore(int c, int d) {
	 int summore=c+d;
	 System.out.println("summore ((10+2)+2)="+summore);
	 return summore;
 }
 public int sub(int e, int f) {
	 int sub = e-f;
	 System.out.println(" sub (((10+2)+2)-2)="+sub);
	 return sub;
 }
 public int mul(int g, int h) {
	 int mul=g*h;
	 System.out.println("mul ((((10+2)+2)-2)*2)="+mul);
	 return mul;
	
 }
 
 public static void main(String[] args) {
	ArithmaticA result = new ArithmaticA();
	int result1 = result.sum(10,2);
	int result2=result.summore(result1, 2);
	int result3=result.sub(result2,2);
	int result4=result.mul(result3, 2);
	System.out.println("final result is "+result4/2);
	
}
 
}
