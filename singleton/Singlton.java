
public class Singlton {
	static Singlton single;
	
	private Singlton() {
		
	}
	
	public static synchronized Singlton getSingleObject(){
		if(single==null) {
			System.out.println("singlton object created for the first time");
			single=new Singlton();
			return single;
		}
		else {
			System.out.println("reusing the existing singlton");
			return single;
		}

}
}
