import java.util.Scanner;

class Numbers{
  private int numbers[] = new int[7];
  private boolean isTen = false;
  private boolean isTwenty = false;
  public void checkNumbers(){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < numbers.length; i++){
      System.out.printf("\nEnter number for index# %d: ", i);
      numbers[i] = scanner.nextInt();
}
   
    for(int i = 0; i < numbers.length - 1; i++){
      if(numbers[i] == 10){
	isTen = true;
  	for(int j = i + 1; j < numbers.length; j++){
  	  if(numbers[j] == 20){isTwenty = true; break;}
}
}
}

    if(isTen == true && isTwenty == true){
      System.out.print("\n10 and 20 are present. 20 is after 10.");
}
    else if(isTen == true && isTwenty == false){
      System.out.print("\n10 is present but 20 is not in array after 10.");

}

    else{
      System.out.print("\n10 and 20 are not present in ascending sequence.");
}
}
}

public class main{
  public static void main(String args[]){
    Numbers number = new Numbers();
    number.checkNumbers();
}
}