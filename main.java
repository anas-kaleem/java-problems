class Division{
	private int number1_ = 50;
	private int number2_ = 3;
	public void computeDivision(){
		System.out.println("Expected output: ");
		System.out.println(number1_/number2_);
}
}

public class main{
	public static void main(String args[]){
		Division division = new Division();
		division.computeDivision();
}
}
