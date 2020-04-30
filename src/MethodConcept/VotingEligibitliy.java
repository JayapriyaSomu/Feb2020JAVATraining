package MethodConcept;

/**
 * A person is eligible to vote if his/her age is greater than or equal to 18. 
 * Define a method to find out if he/she is eligible to vote.
 * @author Jayapriya
 *
 */
public class VotingEligibitliy {

	String output;
	
	public String isEligible(int age){
		if(age >= 18){
		  output = "This person is eligible to vote";
		} else{
			System.out.println("This person is not eligible to vote");
		}
		return output;
	}
	
	public static void main(String[] args) {

		VotingEligibitliy obj = new VotingEligibitliy();
		String result = obj.isEligible(20);
		System.out.println(result);
		
	}

}
