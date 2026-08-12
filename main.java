import java.util.Scanner;

class Test{
  private int inputNum;
  private int helpingNum;
  private int decimalNum = 0;
  private int power = 1;
  private char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  private String hexaDecimal = "";
  public void func(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the octal number: ");
    inputNum = scanner.nextInt();
    //octal to decimal converting.
    while(inputNum > 0){
      helpingNum = inputNum % 10;
      decimalNum = (helpingNum * power) + decimalNum;
      inputNum = inputNum/10;
      power = power * 8;
}//1st_while_loop_inside_func
    System.out.println("The decimal number of octal after first while loop is: ");
    System.out.println(decimalNum);
    //decimal to hexadecimal converting.
    while(decimalNum > 0){
      helpingNum = decimalNum % 16;
      hexaDecimal = (arr[helpingNum]) + hexaDecimal;
      decimalNum = decimalNum / 16;
}//2nd_while_loop_inside_func
    System.out.println("hexadecimal number from second while loop is: ");
    System.out.println(hexaDecimal);
}//func
}//class_Test

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.func();
}//void main()
}//class main