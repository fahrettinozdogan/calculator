package eneshocaodev;

public class SimpleCalculator {

	private double firstNumber;
	private double secondNumber;

	

	

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;

	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionResult() {
		return getFirstNumber() + getSecondNumber();
	}

	public double getSubtractionResult() {
		return getFirstNumber() - getSecondNumber();
	}

	public double getMultiplicationResult() {
		return getFirstNumber() * getSecondNumber();
	}

	public double getDivisionResult() {
		if(secondNumber==0) {
			return 0;
		}else {
		return getFirstNumber() / getSecondNumber();
	}
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
}
}
