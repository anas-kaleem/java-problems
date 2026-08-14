import java.util.Scanner;
import java.util.ArrayList;

class StringComparison{
  private ArrayList<Integer> numbers1 = new ArrayList<>();
  private ArrayList <Integer> numbers2 = new ArrayList<>();
  public void compareStrings(){
    Scanner scanner = new Scanner(System.in);
    
    for(int i = 0; i < 7; i++){
      System.out.print("\nEnter the number for first array: ");
      numbers1.add(scanner.nextInt());
}//first-for
    for(int i = 0; i < 11; i++){
      System.out.print("\nEnter the number for second array: ");
      numbers2.add(scanner.nextInt());
}//second-for

    if(numbers1.get(0) == numbers2.get(0)){System.out.print("\nfirst number of both strings is equal");}
    else{System.out.print("\nfirst number of both strings is not equal");}
    if(numbers1.get(numbers1.size()-1) == numbers2.get(numbers2.size() - 1)){System.out.print("\nlast number of both strings is equal");}
    else{System.out.print("\nlast number of both strings is not equal");}
}  
}

public class main{
  public static void main(String args[]){
    StringComparison comparison = new StringComparison();
    comparison.compareStrings();
}
}