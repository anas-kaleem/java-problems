class sumOfNumbers{
	private int number1_ = 74;
	private int number2_ = 36;
	public int computeSum(){
		return number1_ + number2_;
}
	
}

public class main{
	public static void main(String args[]){
		sumOfNumbers sumObject = new sumOfNumbers();
		System.out.println(sumObject.computeSum()); 
}
}