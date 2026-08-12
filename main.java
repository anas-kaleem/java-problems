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
class Product{
	private int number1_;
	private int number2_;
	private int product;
	public void computeProduct(){
		userInput input = new userInput();
		number1_ = input.getUserInput();
		number2_ = input.getUserInput();
		product = number1_ * number2_;
		System.out.println(product);
}
}

public class main{
	public static void main(String args[]){
		Product product = new Product();
		product.computeProduct();
}
}