package facade;

public class Reader {
	
	private String fileName; 
	
	public Reader(String fileName) {
		this.fileName = fileName; 
	}
	
	public void fileConnect() {
		String msg = String.format("Reader %s 로 연결합니다.", fileName);
		System.out.println(msg);
	}
	
	public void fileReader() {
		String msg = String.format("Reader %s 로 내용을 읽어 봅니다.", fileName);
		System.out.println(msg);
	}
	
	public void fileDisconnect() {
		String msg = String.format("Reader %s 로 연결 종료 합니다.", fileName);
		System.out.println(msg);
	}
	
}
