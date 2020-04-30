package AbstractConcept;

public class internetExplorer extends webDriver{
	
	@Override
	public void get(String url) {
		System.out.println("internetExplorer - launching url");
	}

	@Override
	public void findElement(String element) {
		System.out.println("internetExplorer - finding element");
	}

	@Override
	public String getTitle() {
		System.out.println("internetExplorer - get the page title");
 		return "gmail";
	}

	@Override
	public void quit() {
		System.out.println("internetExplorer - quit");

}

}
