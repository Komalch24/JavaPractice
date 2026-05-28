package InterfaceAndAbstract;

public class Honda implements Car{

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine of honda");
		
	}

	@Override
	public void Tyre() {
		// TODO Auto-generated method stub
		System.out.println("Typre of MRF for HONDA");
	}

	@Override
	public void Oil() {
		// TODO Auto-generated method stub
		System.out.println("Petrol for Honda");
		
	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Color Red of honda");
	}
	
	public void MyMethod() {
		System.out.println("Method of Honda");
	}

}
