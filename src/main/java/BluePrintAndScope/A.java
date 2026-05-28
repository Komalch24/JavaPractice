package BluePrintAndScope;

public class A extends B{

	public static void main(String args[]) {
		 B b = new  A();  
				
		System.out.println(B.BNumber);
		System.out.println(b.BNumber);
		System.out.println(b.BBNumber);
		System.out.println(b.MethodBABC());
		System.out.println(b.MethodBABC());
		System.out.println(b.MethodBABC());
		
	}
	
	public void MethodAB() {
		System.out.println("printing from class A memthod AB");
	}
	
	public void MethodABC() {
		System.out.println("printing from class A method ABC");
	
	}
}
