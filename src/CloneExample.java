
public class CloneExample implements Cloneable {
	int x=100;
	int j = 200;
	public static void main(String[] args) throws CloneNotSupportedException {
		// clone()
		System.out.println("###################################################");
		System.out.println("Clone method we can create object using an existing object");
		System.out.println("###################################################");
		System.out.println("Deep cloning - one more copy of the exiting object");
		CloneExample b = new CloneExample();
		CloneExample b1 = (CloneExample) b.clone(); // deep cloning example
		CloneExample b2 = b; //Shallow Cloning - creates another memory- changes to original (b) will also be reflected on another(b2)
		System.out.println("###################################################");
		System.out.println("Multiple object references can be pointed to same object/ memory.");
		System.out.println("###################################################");
		
		System.out.println(b.x+"\t"+b.j);
		System.out.println(b1.x+"\t"+b1.j);
		System.out.println(b2.x+"\t"+b2.j);
		System.out.println("###################################################");
		b.x = 500;
		b1.j= 900;
		b2.j=1000;
		System.out.println(b.x+"\t"+b.j);
		System.out.println(b1.x+"\t"+b1.j);
		System.out.println(b2.x+"\t"+b2.j);
	}

}
