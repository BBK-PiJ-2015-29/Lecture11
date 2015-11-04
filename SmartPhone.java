/**
 * A SmartPhone is a MobilePhone with more functionality.
 */ 
public class SmartPhone extends MobilePhone{
	
	/**
	 * Constructor which calls the super constructor
	 *
	 * @param brand is the brand needed for the parent constructor
	 */
	public SmartPhone(String brand) {
		super(brand);
	}
	
	/**
	 * Method overrides the parent class method and checks
	 * the number to be called to determine if it is an international
	 * number. If so it calls the number via the internet.
	 *
	 * @param number the number to be called
	 */
	@Override
	public void call(String number) {
		String prefix = number.substring(0,2);
		if (prefix.equals("00")) {
			System.out.println("Calling " + number + 
								" through the Internet to save money");
			super.myCallHistory.push(number);
		}
		else {
			super.call(number);
		}
	}
	
	/**
	 * Method which initialises a web browser and accesses a given
	 * web address.
	 *
	 * @param address the web address to be accessed.
	 */
	public void browseWeb(String address) {
		System.out.println("Now accessing " + address);
	}
	
	/**
	 * Method which returns the GPS coordinates of the phone
	 *
	 * @return a String containing the GPS coordinates
	 */
	public String findPosition() {
		String position = "";
		position = "51.52426545314124,-0.1326239258051";
		return "Your position is: " + position;
	}
	
	/**
	 * Public version of the private method in Mobile phone
	 *
	 * @param name a string which is the name of the game to be played.
	 */
	public void playGame(String name) {
		System.out.println("Now playing " + name);
	}
}