package interfaceConcept;

public class College implements Medical, NonMedical, Commerce {

	@Override
	public void biology() {
		System.out.println("College - biology");
	}

	@Override
	public void science(String subjType) {

		if (subjType.equalsIgnoreCase("medical")) {
			System.out.println("Medical - science");
		} else if (subjType.equalsIgnoreCase("Nonmedical")) {
			System.out.println("NonMedical - science");
		} else if (subjType.equalsIgnoreCase("Commerce")) {
			System.out.println("Commerce - science");
		}
	}

	@Override
	public void mathematics(String subject) {
		if (subject.equalsIgnoreCase("medical")) {
			System.out.println("Medical - mathematics");
		} else if (subject.equalsIgnoreCase("Nonmedical")) {
			System.out.println("NonMedical - mathematics");
		} else if (subject.equalsIgnoreCase("Commerce")) {
			System.out.println("Commerce - mathematics");
		}

	}

	@Override
	public void economics() {
		System.out.println("College - economics ");
	}

}
