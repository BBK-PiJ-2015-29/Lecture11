/**
 * Class to test functionality of the SmartPhone class
 *
 */
public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher myTest = new PhoneLauncher();
		myTest.launch();
	}
	/**
	 * Launch method, main code run from here.
	 *
	 */
	public void launch() {
		MobilePhone samsung = new SmartPhone("Samsung");
		samsung.call("0208 445 3220");
		samsung.call("07743 547 689");
		samsung.call("07864 234 488");
		samsung.call("0207 447 2330");
		samsung.call("00 122 3423 554");
		
		System.out.println("\nLast 10 numbers:");
		System.out.println(samsung.printLastNumbers());
		
		samsung.ringAlarm("Wake up!");
		samsung.playGame("Angry Birds");
		
		
		System.out.println();
		MobilePhone m1 = new MobilePhone("Nokia");
		testPhone(samsung);
		testPhone(m1);
	}
	public void testPhone(Phone p1) {
		SmartPhone s1 = (SmartPhone) p1;
		s1.call("02084448885");
		s1.call("556418");
		System.out.println(s1.printLastNumbers());
		System.out.println();
		s1.browseWeb("http://www.google.co.uk");
		System.out.println(s1.findPosition());
		System.out.println();
	}
}