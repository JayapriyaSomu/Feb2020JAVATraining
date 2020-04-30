package ConstructorConcept;
import java.util.ArrayList;
public class BrowserTemplate {
	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> listOfPlugins;

	public BrowserTemplate(String browserName, String vendorName, double currentVersion,
			ArrayList<String> listOfPlugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.listOfPlugins = listOfPlugins;
	}

	public BrowserTemplate(String browserName, String vendorName, double currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public BrowserTemplate(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public BrowserTemplate(String browserName) {
		this.browserName = browserName;
	}

	public static void main(String[] args) {
		
		ArrayList<String> listOfPlugins = new ArrayList<String>();
		listOfPlugins.add("Firebug");
		listOfPlugins.add("Firepath");
		listOfPlugins.add("Chropath");
		
		BrowserTemplate b1 = new BrowserTemplate("Chrome", "Google", 1.2, listOfPlugins);
		BrowserTemplate b2 = new BrowserTemplate("FireFox", "Mozilla", 8.1);
		BrowserTemplate b3 = new BrowserTemplate("Safari","Apple");
		BrowserTemplate b4 = new BrowserTemplate("IE");
		
		System.out.println(b1.browserName + "  " +  b1.vendorName + "  " + b1.currentVersion + "  "
				+ b1.listOfPlugins);
		System.out.println(b2.browserName + "  " +  b2.vendorName + "  " + b2.currentVersion);
		System.out.println(b3.browserName + "  " +  b3.vendorName);
		System.out.println(b4.browserName);
		}

}
