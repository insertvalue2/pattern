package adapter;

public class Main {

	public static void main(String[] args) {
		
		HairDryer dryer = new HairDryer(); 
		connect(dryer);
		
		Cleanner cleanner = new Cleanner(); 
		
//		connect(cleanner);
		Electronic110v adapter = new SocketAdapter(cleanner);
		connect(adapter);
	}
	
	// 콘센트 
	public static void connect(Electronic110v electronic110v  ) {
		electronic110v.powerOn();
	}
	

	
	
	
}
