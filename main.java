import java.util.Scanner;
import java.lang.Integer;
class Palindrome{
  private int number;
  private String result = "";
  public void checkPalindrome(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    number = scanner.nextInt();
    int temp = number;
    while(temp > 0){
      result = result + (temp % 10);
      temp = temp / 10;
      
}
    if(Integer.parseInt(result) == number){
      System.out.printf("YES! the number is a palindrome: %d = %s", number, result);
}
    else{System.out.printf("NO! the number is not a palindrome: %d != %s", number, result);}
}
}

public class main{
  public static void main(String args[]){
    Palindrome palindrome = new Palindrome();
    palindrome.checkPalindrome();
}
}