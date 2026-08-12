import java.util.Scanner;

class Test{
  private String inputNum;
  private char helpingNum;
  private int index = 0;
  private int power = 1;
  
  private char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  public void func(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the hexadecimal number: ");
    inputNum = scanner.nextLine();
    for(int i = (inputNum.length() - 1); i >= 0; i--){
      helpingNum = inputNum.charAt(i);
      helpingNum = Character.toUpperCase(helpingNum);
      for(int j = 0; j < arr.length; j++){
        if(arr[j] == helpingNum){
	  index = (j * power) + index;
	  power = power * 16;
}//if_inside_2nd_for
}//2nd_for_inside_func()
}//1st_for_inside_func()

System.out.println("The decimal number is: ");
System.out.print(index);
}//func
  
}//class_Test

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.func();
}
}
