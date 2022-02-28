package adapter;

public class Cleanner implements Electronic220v{
	
	@Override
	public void connect() {
		System.out.println("청소기 220v On");
		
	}

}
