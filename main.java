import java.util.Scanner;

class myClass{
  private int inputNum = 250;
  private int helpingNum;
  private char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  private String hexaDecimal = "";
  public void func(){
    while(inputNum > 0){

      helpingNum = inputNum % 16;
      hexaDecimal = hexaDecimal + (arr[helpingNum]);
      inputNum = inputNum / 16;
}//while_loop
    System.out.printf("The hexadecimal number of %d is: %s",inputNum,hexaDecimal);
}//func()
}//class Test

public class test{
  public static void main(String args[]){
	myClass myObj = new myClass();
	myObj.func();
}//class test
}//main()


//Scanner scanner = new Scanner(System.in);
    //number1 = scanner.nextInt();
      //number2 = (number1 % 100);
     //number1 = (number1 / 100);
	//System.out.println(number1 % 100);
	//System.out.print(number1 / 100);
    //System.out.printf("number is: %d. hexadecimal is: %s",number1,hexaDecimal);