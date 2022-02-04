package ConstructorOverloading;

public class MainConstructorOverloading {
	public static void main(String[] args) {
		Employee employee=new Employee(12);
		employee.display();
		
		Employee employee2=new Employee(13,32);
		employee2.display();
	}

}
