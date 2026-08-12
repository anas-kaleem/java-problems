

@@11class BinaryOperation{
	private int num1_ = 0b10;
	private int num2_ = 0b11;
	private int result;
	public void binaryAddition(){
		result = num1_ & num2_;
		System.out.println(Integer.toBinaryString(result));	
}
}

public class main{
	public static void main(String args[]){
		BinaryOperation binaryOperation = new BinaryOperation();
		binaryOperation.binaryAddition();
}
}11@@
