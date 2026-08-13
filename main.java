import java.util.Scanner;

class Characters{
  private String text;
  public void printText(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the text: ");
    text = scanner.nextLine();

   if(text.length() <= 3){
     for(int i = 0; i < 3; i++){
	System.out.print("#");
}

    
}

   else{
     for(int i = 0; i < 3; i++){
	System.out.print(text.charAt(i));
}
}
}
}

public class main{
  public static void main(String args[]){
    Characters character = new Characters();
    character.printText();
}
}