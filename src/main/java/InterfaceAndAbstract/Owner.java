package InterfaceAndAbstract;

public class Owner {
	public static void main(String args[]) {
		
		Car car = new Porche();
		Porche car1 = new Porche();
		//Car car=new Car(); not allowed in interface
		
		//car.Oil();
		//car.MyMethod();     MyMethod is inside the class.
		
		//car.Key1();// we can only access those methods only which are defined in porsche of interface car ,
		// neither we can access methods which are define using static keyword inside car interface 
	   // nor we can access methods which are declared and defined inside porsche
		
		car1.MyMethod();//here we can access those methods are  declared and defined inside porsche
		Car.Key1();//now we can accesss methods which are declare and define inside car interface
		
		car.RunPrivateMethod();
		car.MethodDefinitionWithDefault();
		
	}
	
	// default static void Method() {} 
	//we cannot create default methods inside class, It is only present in interfaces,
	// static can be used in both interfaces and class. By using default we create object inside interface and can have body,
	// body for private method usage as well.
	
	
}
