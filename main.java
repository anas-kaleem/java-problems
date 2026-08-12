
class Test{
  
  private int number = 5;
  private String binaryString = "";
  private int arr[] = {128,64};
  public void print(){

    while(number != 0){
      if(number == arr[0]){
        binaryString = binaryString + '1';
	number = arr[0] - number;
	arr[0] = arr[1];
        arr[1] = (arr[1]/2);
}//1stIf
      else if((number < arr[0]) && (number >= arr[1])){
	binaryString = binaryString + '1';
	number = number - arr[1];
        arr[0] = arr[1];
        arr[1] = (arr[1]/2);
}//1stElseifOF1stIf
      else{
	binaryString = binaryString + '0';
        arr[0] = arr[1];
        arr[1] = (arr[1]/2);
	
}//elseOF1stIf
	System.out.print(arr[0]);
        System.out.println(arr[1]);
}//while(num ==1 )

System.out.println("");
System.out.printf("The binary form of the number %d is: %s ",number,binaryString);
}//print()
}//class Test

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.print();
}//main()
}//class main()
