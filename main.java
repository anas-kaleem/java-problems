class Test{
  private int num = 1;
  private int number = 5;
  private int arr[] = {128,64};
  public void print(){

    while(num == 1){
      if(arr[1] == 0){
        num = 0;
}//1stIf
      else if(num != 0){
	System.out.print(arr[0]);
        System.out.println(arr[1]);
        arr[0] = arr[1];
        arr[1] = (arr[1]/2);
}//1stElseifOF1stIf
}//while(num ==1 )
}//print()
}//class Test

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.print();
}//main()
}//class main()