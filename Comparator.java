public class Comparator {
	public int getMax(int n, int m) {
		double d1 = (double) n;
		double d2 = (double) m;
		int max = (int) getMax(d1,d2);
		return max;
		//the above can be done with only one line
		//return (int) getMax((double) n, (double) m);
	}
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		Integer max = (Integer) getMax(n1,n2);
		
		String output = max.toString();
		return output;
		
	}
}