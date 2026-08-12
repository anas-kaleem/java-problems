class Test{
  public void printLineOne(){
    for(int i = 1; i <= 90; i++){
      if(i <= 12){
	if(i % 2 != 0){System.out.print("*");
	
}//if(i%2 != 0)
	else if(i%2 == 0){System.out.print(" ");

}//elseif(i%2 ==0)
}//if(i<=12)
      else if(i>12){System.out.print("=");

}//elseif(i>12)
}//for() inside printLineOne()

System.out.println("");

}//printLineOne()

  public void printLineTwo(){
    for(int i = 1; i <= 90; i++){
      if(i <= 12){
	if(i % 2 == 0 && i != 12){System.out.print("*");
	
}//if(i%2==0) inside printTwo()
	else if(i == 12){System.out.print(" ");

}//elseif(i==12) inside printTwo()
	else if(i % 2 != 0){
	  System.out.print(" ");
}//elseif (i%2 != 0) inside printTwo()

}//if(i<=12) in printTwo()
      else if(i > 12){ 
	System.out.print("=");
}//elseif(i > 12) inside printTwo()
}//for() inside printLineTwo()
System.out.println("");
}//printLineTwo()

  public void printEquals(){
    for(int i = 1; i <= 90; i++){
      System.out.print("=");
}//for() inside printEquals()
System.out.println("");
}//printEquals()
}//class Test{}

class Helper{
  public void helpPrint(){
    Test test = new Test();
    for(int i = 1; i <= 8; i++){
      if(i <= 5){
	test.printLineOne();
	test.printLineTwo();
}//if(i<=6) inside for() of helperPrint()

      else if(i>5){
	test.printEquals();
	test.printEquals();
}//elseif(i>5) inside for() of helpPrint()
}//for() inside helpPrint()
}//helpPrint()
}//class Helper

public class main{
  public static void main(String args[]){
    Helper helper = new Helper();
    helper.helpPrint();
}//public Static Void Main()
}//class main
