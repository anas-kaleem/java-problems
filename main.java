import java.util.Scanner;

class UserInput{
	private int number_;
	public int takeUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number_ = scanner.nextInt();
		return number_;
}
}

class Partition{
	private int inputNumber_;
	
	public void takeInput(){
		UserInput input = new UserInput();
		inputNumber_ = input.takeUserInput();
		
}
	public void partitionNumber(){
		takeInput();
		
		while(inputNumber_ != 0){
			System.out.println(inputNumber_ % 10);
			inputNumber_a = inputNumber_ / 10;
}
}
}

public class main{
	public static void main(String args[]){
		Partition partition = new Partition();
		partition.partitionNumber();
}
}