package secondPackage;

public class AbstractClass1 extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AbstractClass1 obj = new AbstractClass1();
 obj.run();
 obj.behaviour();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Print Run");
	}

}
