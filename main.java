class Test{
  public void print(){
    for(int i = 1; i <= 90; i++){
      if(i <= 12){
	if(i % 2 != 0){System.out.print("*");
	
}//if(i%2 != 0)
	else if(i%2 == 0){System.out.print(" ");

}//elseif(i%2 ==0)
}//if(i<=12)
      else if(i>12){System.out.print("=");}//elseif(i>12)
}//for() inside Print()
}//void Print()
}//class Test{}

public class main{
  public static void main(String args[]){
    Test test = new Test();
    test.print();
}//public Static Void Main()
}//class main


