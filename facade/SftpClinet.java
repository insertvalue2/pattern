package facade;

public class SftpClinet {

	private Ftp ftp; 
	private Reader reader; 
	private Writer writer;
	
	
	public SftpClinet(Ftp ftp, Reader reader, Writer writer) {
		this.ftp = ftp;
		this.reader = reader;
		this.writer = writer;
	}
	
	public SftpClinet(String host, int port, String path, String fileName) {
		this(new Ftp(host, port, path), new Reader(fileName), new Writer(fileName));
//		this.ftp = new Ftp(host, port, path);
//		this.reader = new Reader(fileName);
//		this.writer = new Writer(fileName);
	}
	
	public void connect() {
		ftp.connect();
		ftp.moveDirectory();
		writer.fileConnect();
		reader.fileConnect();
	}
	
	public void read() {
		reader.fileReader();
	}
	
	public void write() {
		writer.write();
	}
	
	public void disconnect() {
		writer.fileDisconnect();
		reader.fileDisconnect();
		ftp.disConnect();
	}
	
}
