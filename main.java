import java.util.Scanner;

class CommonDigits{
  private int number1;
  private int number2;
  private int arr1[];
  private int arr2[];
  private boolean result;
  public void print(){
    System.out.print(isCommon());
}
  public boolean isCommon(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    number1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    number2 = scanner.nextInt();
    
    if((number1 >= 25 && number1 <= 75) && (number2 >= 25 && number2 <= 75)){
      int i = 0;
      int temp = number1;
      while(temp > 0){
        i++;
        temp = temp/10;
}//1st-while-in-if-of-isCommon()

    arr1 = new int[i];
    arr2 = new int[i];
      for(int j = 0; j < i; j++){
        arr1[j] = number1 % 10;
        arr2[j] = number2 % 10;
        number1 = number1 / 10;
        number2 = number2 / 10;
}//1st-for-loop-in-1st-if-in-isCommon()
       
      for(int k = 0; k < arr1.length; k++){
        for(int m = 0; m < arr2.length; m++){
          if(arr1[k] == arr2[m]){result = true;}
         
}
}//2nd-for-loop-in-if-of-isCommon()
}//1st-if-in-isCommon()

   else{System.out.print("number is not between range of 25 and 75");}

   return result;
}//boolean-isCommon()
}//class-CommonDigits{}


public class main{

  public static void main(String args[]){
    CommonDigits common = new CommonDigits();
    common.print();
}

}
