package AbstractConcept;

public class safaridriver extends webDriver {
	
	@Override
	public void get(String url) {
		System.out.println("safaridriver - launching url");
	}

	@Override
	public void findElement(String element) {
		System.out.println("safaridriver - finding element");
	}

	@Override
	public String getTitle() {
		System.out.println("safaridriver - get the page title");
 		return "gmail";
	}

	@Override
	public void quit() {
		System.out.println("safaridriver - quit");

}

}
