package InterfaceAndAbstract;

public abstract class AbstractClass {
	
	public int a;

	public int method1() {
		return 0;
	}
	
	public abstract void AbsMethod();
	
	public abstract int method2();
	
	protected abstract int method3();
	
//	private abstract int method() {   private not allowed, default not allowed
//		
//	}
	
	public void PublicMethod() {
		System.out.println(" Public method of Abstract class");
	}
	
	public void OverrideMethod() {
		System.out.println(" override method from abstract class");
	}
}
