package Package1;

public class StatictoStatic 
{
    public static void method1() {
    	System.out.println("This is static method");
    }
	
    public static void main(String[] args) {
		method1();
		StatictoStatic.method1();
		StatictoStatic S=new StatictoStatic();
		S.method1();
		
	}
}
