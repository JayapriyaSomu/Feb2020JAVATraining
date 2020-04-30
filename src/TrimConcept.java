
public class TrimConcept {
	public static void main(String[] args) {

		String s = "Jayapriya  ";

		System.out.println(s.trim());

		System.out.println(s.replace(' ', 'k'));

		if (s.contains("a")) {
			System.out.println("a is found");
		}

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String lang  = "I;am;coming;home;tomorrow;";
		String langVal[] = lang.split(";");

		for(int i = 0; i < langVal.length;i++) {
			System.out.println(langVal[i]);
		}
		
		
		
		
		
		
	}
}
