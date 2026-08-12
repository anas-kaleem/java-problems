class Combination{
	private int[] nNumbers_ =  {1,2,3,4};
	public void printCombination(){
		for(int i = 0; i <= 4; i++){
		  for(int j =0; j<=4 ; i++){
		    for(int k =0; k<=4;k++){
		      if(i != j && j != k&& i != k){System.out.println(i + "" + j + "" +k);}
}
}
}
}
}

public class main{
	public static void main(String args[]){
		Combination combination = new Combination();

		combination.printCombination();
}
}
