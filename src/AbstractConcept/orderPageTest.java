package AbstractConcept;

public class orderPageTest {

	static webDriver driver;

	public static void main(String[] args) {

		String browser = "safari";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new chromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new fireFoxDriver();
		} else if (browser.equalsIgnoreCase("internetExplorer")) {
			driver = new internetExplorer();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new safaridriver();
		}

		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		driver.findElement("login");
		driver.quit();
		driver.search();
		driver.orderDetails();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
