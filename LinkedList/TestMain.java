package LinkedList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory browser = new BrowserHistory("leetcode.com");
		System.out.println(browser.homePage);
		browser.visit("google.com");
		browser.visit("facebook.com");
		System.out.println(browser.back(2));
		System.out.println(browser.forward(1));
		browser.visit("youtube.com");
		System.out.println(browser.forward(1));
		System.out.println(browser.back(1));
	}

}
