package proxy;

public class MainTest {

	public static void main(String[] args) {

		// Browser browser = new Browser("www.naver.com");
		// browser.show();
		// browser.show();
		// browser.show();
		// browser.show();

		IBrowser browser2 = new BrowserProxy("www.naver.com");
		browser2.show();
		browser2.show();
		browser2.show();
		browser2.show();
		browser2.show();
		
		
		IBrowser browser3 = new BrowserProxy("www.nate.com");
		browser3.show();
		browser3.show();
		browser3.show();
		browser3.show();
	}

}
