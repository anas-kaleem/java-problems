import java.util.Scanner;

class UserInput{
	int inputNumber;
	public int takeUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		inputNumber = scanner.nextInt();
		return inputNumber;
}
}

class Evaluate{
	private int number1_;
	private int number2_;
	private int number3_;

	public void getInput(){
		UserInput input = new UserInput();
		number1_ = input.takeUserInput();
		number2_ = input.takeUserInput();
		number3_ = input.takeUserInput();
} 
	public void evaluateExpression(){
		getInput();
		System.out.println((number1_+number2_+number3_)/3);
}}

public class main{
	public static void main(String args[]){
		Evaluate evaluate = new Evaluate();
		evaluate.evaluateExpression();
}
}