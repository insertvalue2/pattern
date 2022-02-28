package facade;

public class MainTest {

	public static void main(String[] args) {
		
//		Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
//		ftpClient.connect();
//		ftpClient.moveDirectory();
//		
//		Writer writer = new Writer("text.tmp");
//		writer.fileConnect();
//		writer.write();
//				
//		Reader reader = new Reader("text.tmp");
//		reader.fileConnect();
//		reader.fileReader(); 
//		
//		reader.fileDisconnect();
//		writer.fileDisconnect();
//		ftpClient.disConnect();
		
		SftpClinet sftpClinet = new SftpClinet("www.foo.co.kr", 22, "/home/etc", "text.tmp");
		sftpClinet.connect();
		sftpClinet.write();
		sftpClinet.disconnect();
		
	}
}
