import java.util.Scanner;

class UserInput{
	private int inputNumber_;
	public int takeUserInput(){
                Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		inputNumber_ = scanner.nextInt();
		return inputNumber_;
}
}

class Swapper{
	private int number1_;
	private int number2_;
	private int temporaryNumber_;
	public void swapTwoNumbers(){
		UserInput input = new UserInput();
		number1_ = input.takeUserInput();
		number2_ = input.takeUserInput();
		temporaryNumber_ = number1_;
		number1_ = number2_;
		number2_ = temporaryNumber_;
		printSwappedNumber();
		
}
	public void printSwappedNumber(){
		System.out.println(number1_);
		System.out.println(number2_);
}
}

public class main{
	public static void main(String args[]){
		Swapper swapper = new Swapper();
		swapper.swapTwoNumbers();
}
}