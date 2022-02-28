package singleton;

public class BClass {

	private SocketClient socketClient; 
	
	public BClass() {
		socketClient = SocketClient.getInstance(); 
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient; 
	}
	
}
