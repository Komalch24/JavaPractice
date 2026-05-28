package InterfaceAndAbstract;

public class Porche implements Car {

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine of Porche");
		
	}

	@Override
	public void Tyre() {
		// TODO Auto-generated method stub
		System.out.println("Typre of MRF for Porchse");
	}

	@Override
	public void Oil() {
		// TODO Auto-generated method stub
		System.out.println("Green fuel for Porche");
		
	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Special Color Red of Porche");
	}
	public void MyMethod() {
		System.out.println("Method of Prsche");
	}
	
	 public void MethodDefinitionWithDefault() {
		 Car.super.MethodDefinitionWithDefault();
		 System.out.println(" method with same name as in Interface Inside Porsche");
	 }
}
