package BasicCalculator.maven.com;

public class BasicCalculator {
	static int a;
	static int b;

	BasicCalculator() {
		// constructor
	}

	BasicCalculator(int a, int b) {
		a = a;
		b = b;

	}

	int getAdd() {
		int add; // local variable
		add = a + b;
		return (add);

	}

	public static int sub() {
		int sub; // local variables(){
		sub = a - b;
		return (sub);
	}

	float getDiv() {
		float div; // local variables(){
		div = a / b;
		return (div);
	}

	int getMult() {
		int mult; // local variables(){
		mult = a * b;
		return (mult);
	}

	void Display() {
		//System.out.println("Subtraction is" + this.Sub());
		System.out.println("Addition is" + this.getAdd());
		System.out.println("Multiplication is" + this.getMult());
		System.out.println("Division is" + this.getDiv());

	}
}

class ImplBasicCalc {
	public static void main(String[] args) {
		BasicCalculator basicCalc = new BasicCalculator(); // instance of Constructor
		basicCalc.a = 10;
		basicCalc.b = 5;
		basicCalc.Display();
		BasicCalculator BC = new BasicCalculator(400, 200); // instance of parameterized Constructor
		BC.Display();
	}
}
