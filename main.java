import java.util.Scanner;

//class UserInput starts here.
class UserInput{
  private int integerInput;
  private char characterInput;
  public int takeIntegerInput(){
    Scanner scanner = new Scanner(System.in);
    integerInput = scanner.nextInt();
    return integerInput;	  
}//takeIntegerInput function end bracket.

  public char takeCharacterInput(){
    Scanner scanner = new Scanner(System.in);
    characterInput = scanner.next().charAt(0);
    return characterInput;
}//takeCharacterInput end bracket.
}//class userInput end bracket.

class Prompt{
  private int number;
  private String[] lines = {"Enter p to produce an item in buffer","Enter c to consume an item from buffer", "Enter q to quit"};
  public void showPrompt(){
    for(int i = 0; i<3; i++){System.out.println(lines[i]);}//first for loop inside showPrompt function end bracket.
}//showPrompt function end bracket.

  public int getSize(){
    System.out.print("Please enter the size of buffer: ");
    UserInput input = new UserInput();
    number = input.takeIntegerInput();
    return number;
}//getSize function end bracket.
}//class prompt end bracket.

class ProducerConsumer{
  private char produce = 'p';
  private int[] buffer;
  public void produce(){
    Prompt prompt = new Prompt();
    buffer = new int[prompt.getSize()];
    prompt.showPrompt();
}//produce function end bracket.
}//class ProducerConsumer end bracket.
