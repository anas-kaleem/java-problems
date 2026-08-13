import java.util.Scanner;

class Length{
  private String text1;
  private String text2;
  private int str1Length;
  private int str2Length;
  public void printSequence(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first text: ");
    text1 = scanner.nextLine();
    System.out.print("Enter second text: ");
    text2 = scanner.nextLine();
    
    str1Length = text1.length();
    str2Length = text2.length();
    if(str1Length < str2Length){
      System.out.print(text1 + " " +  text2 + " " + text1);
}
    else{
      System.out.print(text2 + " " + text1 + " "+ text2);
}
}
}

public class main{
  public static void main(String args[]){
    Length length = new Length();
    length.printSequence();   
}
}