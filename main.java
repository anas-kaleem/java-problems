import java.util.Scanner;

class Index{
  private int counter = 0;
  private int index;
  private int target;
  
  private boolean isTrue = false;
  private int numbers[] = {2,3,5,6,8,11};
  private int arrayTemp = (numbers[numbers.length - 1]) + 1;
  private int indexTemp = numbers.length;
  public void findIndex(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the number: ");
    target = scanner.nextInt();
    while(isTrue == false){
      if((counter < numbers.length && target < numbers[counter]) || (counter >= numbers.length && target < arrayTemp)){System.out.print("\nThe number is not in array!");break;}
      if(counter < numbers.length && numbers[counter] == target){
	isTrue = true;
	index = counter;
	
}
      else if(counter >= numbers.length && target == arrayTemp){
	isTrue = true; index = indexTemp;
	
}
      else if(counter >= numbers.length && target != arrayTemp){arrayTemp = arrayTemp + 1; indexTemp = indexTemp + 1;}
      else{counter = counter + 1;}
}

    if(isTrue == true){System.out.printf("\nThe number is at: %d",index);}
    
}
}

public class main{
  public static void main(String args[]){
    Index indexObj = new Index();
    indexObj.findIndex();
}
}