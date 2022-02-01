
public class FinalizeExample {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Perform clean up operation.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeExample obj = new FinalizeExample();
		obj = null;
		System.gc();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank You.");
		
	}

}
