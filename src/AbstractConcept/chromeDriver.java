package AbstractConcept;

public class chromeDriver extends webDriver{

	@Override
	public void get(String url) {
		System.out.println("Chromedriver - launching url");
	}

	@Override
	public void findElement(String element) {
		System.out.println("Chromedriver - finding element");
	}

	@Override
	public String getTitle() {
		System.out.println("Chromedriver - get the page title");
 		return "gmail";
	}

	@Override
	public void quit() {
		System.out.println("Chromedriver - quit");
	}
	
	@Override
	public void search() {
		System.out.println("ChromeDriver - search");
	}

}
