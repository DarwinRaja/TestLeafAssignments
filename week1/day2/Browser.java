package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser web = new Browser();
		String net = web.launchBrowser("Chrome");
		System.out.println("The launched browser is:"+" "+net);
		web.loadUrl();
	}

}
