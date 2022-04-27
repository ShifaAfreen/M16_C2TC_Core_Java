package in.cg.stringbuffer;
//StringBuilder
public class Example3 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("shifa");
		System.out.println(sb.capacity());
		StringBuilder obj= new StringBuilder();
		obj.append("Afreen");
		System.out.println(obj.capacity());
		obj.append("My full name is Shifa afreen sheikh haroon");
		System.out.println(obj.capacity());//(old capacity*2)+2
	
		

	}

}
