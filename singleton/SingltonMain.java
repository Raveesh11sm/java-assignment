
public class SingltonMain {
	public static void main(String[] args) {
		Singlton single=Singlton.getSingleObject();
		System.out.println(single);
		
		Singlton single2=Singlton.getSingleObject();
		System.out.println(single2);
		
		if(single.equals(single2))
			System.out.println("same object");
	}

}
