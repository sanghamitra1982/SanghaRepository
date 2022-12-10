package Package1;

public class Arithmetic {
  public int sumresult(int a, int b) {
	  int sumresult = a+b;
	  System.out.println("sumresult is "+sumresult);
	  return sumresult;
  }
  public int subresult(int a, int b) {
	  int subresult=a-b;
	  System.out.println("subresult is "+subresult);
	  return subresult;
  }
   
  public void mulresult(int sumresult, int subresult) {
	  int mulresult=sumresult*subresult;
	  System.out.println("mulresult is "+mulresult);
  }
  public static void main(String[] args) {
	Arithmetic result = new Arithmetic();
	int sumresult=result.sumresult(10, 2);
	int subresult=result.subresult(10, 2);
	int mulresult=sumresult*subresult;
	System.out.println("final result is "+mulresult);
	
}
}
