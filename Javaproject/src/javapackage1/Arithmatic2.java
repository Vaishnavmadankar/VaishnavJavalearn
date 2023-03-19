package javapackage1;

public class Arithmatic2 {
	
	public float divide(float a,float b) {
		
		float divide= a/b;
		System.out.println("divides " + divide);
		return divide;
	}
	
    public float sub(float c, float d) {
    	float sub=c-d;
    	System.out.println("sub " + sub);
    	return sub;
    }
    
    public float sum(float e ,float f) {
    	float sum=e+f;
    	System.out.println("sum ofs " + sum);
    	return sum;
    }
    
    public float multi(float g,float h) {
    	float multi=g*h;
    	System.out.println("multi " + multi);
    	return multi;
    }
    
    public static void main(String[] args) {
      Arithmatic2 Obj1=new Arithmatic2();
      float resultdivide=Obj1.divide(10,2);
      float resultsub=Obj1.sub(resultdivide,2);
      float resultsum=Obj1.sum(resultsub,2);
      float resultsub2=Obj1.sub(resultsum,2);
      float resultmulti=Obj1.multi(resultsub2,2);
      System.out.println("Final result " + resultmulti);
     
    } 
    
	
	
}