import java.util.Scanner;

class userInput{
	private int number_;
	public int getUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number_ = scanner.nextInt();
		return number_;
}
}

class Sum{
	private int number1_;
	private int number2_;
	private int sumNumber;
	public void computeSum(){
		userInput input = new userInput();
		number1_ = input.getUserInput();
		number2_ = input.getUserInput();
		sumNumber = number1_ + number2_;
		System.out.print(sumNumber);
}
}

public class main{
	public static void main(String args[]){
		Sum sum = new Sum();
		sum.computeSum();
}
}