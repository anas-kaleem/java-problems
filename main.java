import java.util.Scanner;

class UserInput{
	private int number_;
	public int getUserInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number_ = scanner.nextInt();
		return number_;
}
}

class Table{
	private int tableNumber;
	public void computeTable(){
		UserInput input = new UserInput();
		tableNumber = input.getUserInput();
		for(int i = 1; i <= 10; i++){
			System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
}
}
}

public class main{
	public static void main(String args[]){
		Table table = new Table();
		table.computeTable();
}
}