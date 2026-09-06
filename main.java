import java.util.Scanner;

class SubArrays{
  private int numbers[] = {2,3,-1,5,1,0,-2};
  private int result;
  private int temp;
  private String occurence = "";
  private int index1 = 0;
  private int index2 = 0;
  public void sumArrays(){
    for(int i = 0; i < (numbers.length * 2); i++){
      if(i < numbers.length){
	for(int j = 0; j <= index1; j++){
	  temp = temp + numbers[j];
	  
}
    if(temp > result){result = temp; occurence = "0" + " " + index1; index1 = index1 + 1;}
}

      else if(i >= numbers.length){
	for(int m = 0; m < numbers.length; m++){
	  for(int l = m; l < numbers.length; l++){
	    temp = temp + numbers[l];
	    
}
	if(temp > result){result = temp; occurence = m + " " + numbers.length; index1 = index1 + 1;}
}
}
}

    System.out.printf("\n the biggest sum is: %d at : %s",result, occurence);
} 
}

public class main{
  public static void main(String args[]){
    SubArrays subArray = new SubArrays();
    subArray.sumArrays();
}
}