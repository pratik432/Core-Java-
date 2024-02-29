package Abstraction;

public class CarType implements Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarType obj= new CarType();
		obj.Sedan();
			
	}
	
	@Override                          
	public void Sedan() {
		// TODO Auto-generated method stub
		System.out.println("Sedan Type Car");
		
	}

}
