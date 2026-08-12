class Test{
  private int nameNum[] = {69,64,66,68,65,78,78,74};
  private int pNum[] = {64,77,64,82,74,64,75,68,68,76};
  private char nameStr[] = new char[nameNum.length];
  private char pStr[] = new char[pNum.length];
  public void func(){
    for(int i = 0; i < nameNum.length; i++){
      nameNum[i] = (nameNum[i]) + 1;
      nameStr[i] = (char) (nameNum[i]);
}//1st_for_inside_func
    for(int i = 0; i < pNum.length; i++){
      pNum[i] = (pNum[i]) + 1;
      pStr[i] = (char) (pNum[i]);
}//2nd_for_inside_func
    for(int j = 0; j < nameStr.length; j++){
      System.out.print(nameStr[j]);
}//3rd_for_inside_func

    System.out.println("");
    for(int m = 0; m < pStr.length; m++){ 
      System.out.print(pStr[m]);
}//4th_for_inside_func
}//func
}//class_Test

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.func();
}//void_main
}//class_main
