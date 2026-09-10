import java.util.Scanner;

class SubArrays{
  private int numbers[] = {-2,-3,2,5,1,-15,-1,4};
  private int start = 0;
  private int end = 0;
  private int sum = 0;
  private int result = numbers[0];
  private String occurence = "";
  public void computeSum(){
    for(int i = 0; i < numbers.length; i++){
      sum = sum + numbers[i];
      if(sum < result){
	result = sum;
  	occurence = (start + 1) + " to " + (end + 1);
  	start = end + 1;
  	sum = 0;
}
      end = end + 1;
      
}

    System.out.printf("\nSubarray with smalles sum starts from %s", occurence);
}
}

public class main{
  public static void main(String args[]){
    SubArrays subArray = new SubArrays();
    subArray.computeSum();
}
}