import java.util.Scanner;
import java.lang.Integer;

class UserInput{
  private String binaryString_;
  public String getUserInput(){
    Scanner scanner = new Scanner(System.in);
    binaryString_ = scanner.nextLine();
    return binaryString_;
}//getUserInput()
}//UserInput class

class Test{
  private String binaryString1_;
  private String binaryString2_;
  private int decimalSum;
  private String binarySum;
  public String getUserInput(){
    UserInput input = new UserInput();
    return input.getUserInput();
      
}//func

  public void binaryAddition(){
    binaryString1_ = getUserInput();
    binaryString2_ = getUserInput();
    decimalSum = Integer.parseInt(binaryString1_,2) + Integer.parseInt(binaryString2_,2);
      binarySum = Integer.toBinaryString(decimalSum);
      System.out.println(binarySum);
      System.out.println(decimalSum);
}//binaryAddition
}//Test class

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.binaryAddition();
}
}