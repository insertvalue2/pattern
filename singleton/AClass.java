package singleton;

public class AClass {
	
	private SocketClient socketClient; 
	
	public AClass() {
		socketClient = SocketClient.getInstance(); 
	}
	
	public SocketClient getSocketClient() {
		return this.socketClient; 
	}
	
}
