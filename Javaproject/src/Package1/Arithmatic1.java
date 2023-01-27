package Package1;

    public class Arithmatic1 {

	public int sum1(int a1,int a2) {
		
	int sum1=a1+a2;
	System.out.println("Sum of two variable"+ sum1);
	return sum1;
	}
	
	public int sub(int b1,int b2) {
		
		int sub=b1-b2;
		System.out.println("Sub of two variable"+ sub);
		return sub;
		}
 
	public int multi(int c1,int c2) {
		
		int multi=c1*c2;
		System.out.println("multi of two variable"+ multi);
		return multi;
		}
	
	public float divide(float d1,float d2) {
		
		float divide=d1/d2;
		System.out.println("divide of two variables"+ divide);
		return divide;
		}
	
	 public static void main(String[] args)  {
		 Arithmatic1 Obj1=new Arithmatic1();
		 int sumresult=Obj1.sum1(10,2);
		 int sumresult2=Obj1.sum1(sumresult,2);
		 int subresult=Obj1.sub(sumresult2,2);
		 int multiresult=Obj1.multi(subresult,2);
		 float divideresult=Obj1.divide(multiresult,2);
		 System.out.println("final result "+ divideresult);
	}
	
	
}
