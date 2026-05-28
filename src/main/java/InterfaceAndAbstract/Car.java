package InterfaceAndAbstract;

 public interface Car {
	
	public void Engine();
	public void Tyre();
	public void Oil();
	public void Color();
	
	//private void Key();   // private methods are not allowed in interface
	
	public static void Key1() {     // we can define method inside interface using static keyword
		System.out.println("sfsfs");
	}
	
	//protected void protectedMethod(); // not allowed in interface
	
	private void PrivateMethod() {
		System.out.println("I am private method");
	}
	
	default void RunPrivateMethod() {
		PrivateMethod();
	}
	
	
	/* public void MethodDefinition() { System.out.println(""); } */
	 
	
	default void MethodDefinitionWithDefault() {
		System.out.println(" inside Interface Default method");
	}
	
}