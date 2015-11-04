/**
 * MobilePhone extends OldPhone, 
 * adding extra functionality 
 */

public class MobilePhone extends OldPhone {
	/**
	 * CallHistory is a class which represents a 
	 * stack of numbers.
	 */
	protected CallHistory myCallHistory;

	
	public MobilePhone(String brand) {
		super(brand);
		myCallHistory = new CallHistory();
	}
	
	/**
	 * call method performs the superclass functionality
	 * and then adds a number to the myCallHistory stack
	 * 
	 * @param number is the number to be called
	 */
	public void call(String number) {
		super.call(number);
		myCallHistory.push(number);
	}
	
	/**
	 * Prints the last 10 numbers in the CallHistory.
	 * 
	 * @return a string of all the 10 numbers on different lines
	 */
	public String printLastNumbers() {
		int count = 0;
		String lastNumbers = "";
		while((myCallHistory.peek() != null) && (count < 10)) {
			count++;
			lastNumbers += "" + count + ": " + myCallHistory.pop()+ "\n";
			
		}
		return lastNumbers;
	}
	
	/**
	 * Sounds an alarm for a given event
	 * 
	 * @param event is the name of the event 
	 */
	public void ringAlarm(String event) {
		System.out.println("Its time for " + event);
	}
	
	/**
	 * Starts playing a game
	 *
	 * @param name the name of the game to be played
	 */
	public void playGame(String name) {
		System.out.println("Now playing " + name);
	}
	
}
