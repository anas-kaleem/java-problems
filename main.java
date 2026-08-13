import java.util.Scanner;

class Text{
  private String text1;
  private String text2;
  private String result1 = "";
  private String result2 = "";

  public void concatenate(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first text: ");
    text1 = scanner.nextLine();
    System.out.print("Enter second text: ");
    text2 = scanner.nextLine();
    
    for(int i = 1; i < text1.length(); i++){
      result1 = result1 + text1.charAt(i);
}//1st-for

    for(int i = 1; i < text2.length(); i++){
      result2 = result2 + text2.charAt(i);
}

    System.out.print(result1 + result2);
}//void concatenate()
}//class String

public class main{
  public static void main(String args[]){
    Text text = new Text();
    text.concatenate();
}
}