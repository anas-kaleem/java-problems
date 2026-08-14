import java.util.Scanner;

class Characters{
  private String text1;
  private String text2;
  private String result = "";
  public void concatenateText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first word or sentence: ");
    text1 = scanner.nextLine();
    System.out.print("Enter second word or sentence: ");
    text2 = scanner.nextLine();

    if(text1.length() == 0){
      result = result + "#";
      
}//first-if

    else{
      result = result + text1.charAt(0);
}//first-else-of-first-if
  
    if(text2.length() == 0){
      result = result + "#";
   
}//second-if

    else{
      result = result + text2.charAt(text2.length() - 1);
}

    System.out.print(result);
}		
}

public class main{
  public static void main(String args[]){
    Characters character = new Characters();
    character.concatenateText();
}
}