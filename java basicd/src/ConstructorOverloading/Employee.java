package ConstructorOverloading;

public class Employee {
	int eId;
	int eAge;
	String eName;
	String eAdress;
	
	public Employee(int eId) {
		this.eId=eId;
	}

	public Employee(int i, String eName) {
		this.eName = eName;
	}

	public Employee(int eId, int eAge) {
		super();
		this.eId = eId;
		this.eAge = eAge;
	}

	public Employee(int eId, int eAge, String eName) {
		super();
		this.eId = eId;
		this.eAge = eAge;
		this.eName = eName;
	}

	public Employee(int eId, int eAge, String eName, String eAdress) {
		super();
		this.eId = eId;
		this.eAge = eAge;
		this.eName = eName;
		this.eAdress = eAdress;
	}
//
//	void display() {
//		System.out.println(eId);
//		System.out.println(eId,eAge);
//		System.out.println(eId);
//		System.out.println(eId);
//		
//	}



	public void display() {
		
	}
	
}
