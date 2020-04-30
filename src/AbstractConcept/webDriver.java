package AbstractConcept;

public abstract class webDriver {
	
	public webDriver() {
		System.out.println("Webdriver - default constructor");
	}
	
	public abstract void get(String url);
	public abstract void findElement(String element);
	public abstract String getTitle();
	public abstract void quit();
	
	
	public void search() {
		System.out.println("webDriver - search");
	}
	
	public void orderDetails() {
		System.out.println("webDriver - orderDetails");
	}
	

}
