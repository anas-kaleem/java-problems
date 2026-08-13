import java.util.Scanner;

class Characters{
  private String text;
  private boolean endLoop = false;
  private char arr[];
  public void printCharacters(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a line consisting of at least 3 letters: ");
    text = scanner.nextLine();
   
    while(endLoop == false){
      if(text.length() < 3){
     	System.out.print("Text is smaller than 3 letters. Enter the text again: ");
        text = scanner.nextLine();
}//if
      else{
	endLoop = true;
}//else
}//while

   arr = new char[3];
   int j = 0;
   for(int i = text.length() - 1; i >= (text.length() - 3); i--){
     
     arr[j] = (text.charAt(i));
     j++;
}//for

   for(int i = 3; i >= 0; i--){
     System.out.printf("%c%c%c", arr[2], arr[1], arr[0]);
}
}//printCharacters
}//Characters

public class main{
  public static void main(String args[]){
    Characters characters = new Characters();
    characters.printCharacters();
}
}