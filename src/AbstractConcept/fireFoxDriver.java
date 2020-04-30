package AbstractConcept;

public class fireFoxDriver extends webDriver{
	
	@Override
	public void get(String url) {
		System.out.println("fireFoxDriver - launching url");
	}

	@Override
	public void findElement(String element) {
		System.out.println("fireFoxDriver - finding element");
	}

	@Override
	public String getTitle() {
		System.out.println("fireFoxDriver - get the page title");
 		return "gmail";
	}

	@Override
	public void quit() {
		System.out.println("fireFoxDriver - quit");

}
	
}
