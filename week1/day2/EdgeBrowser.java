package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Browser open = new Browser();
			String app = open.launchBrowser("Edge");
			boolean browserIssue = false;
			System.out.println("The launched browser is:"+" "+app);
			System.out.println("Any issues launching browser:"+" "+browserIssue);
			open.loadUrl();
	}

}
