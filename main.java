import java.util.Scanner;

class Test{
  private int inputNum;
  private int helpingNum;
  private int octalNum = 0;
  private int binaryPosition = 1;
  private char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  private int decimalSum = 0;
  private String hexaDecimal = "";
  public void func(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the binary number: ");
    inputNum = scanner.nextInt();
    while(inputNum > 0){
      helpingNum = (inputNum % 2);
      decimalSum = (helpingNum * binaryPosition) + decimalSum;
      inputNum = inputNum / 10;
      binaryPosition = (binaryPosition * 2);
}//1st_while

    while(decimalSum > 0){
      helpingNum = (decimalSum % 8);
      hexaDecimal = helpingNum + hexaDecimal;
      decimalSum = decimalSum / 8;

}//2nd_while
    
System.out.println(hexaDecimal);
}//func()
}//class Test

public class main{
  public static void main(String args[]){
	Test test = new Test();
	test.func();
}
}