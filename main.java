//class starts here.
class Processes{

//private variables start.
	private int[] processBurst = {16,8,5,10};
	private int[] timer = {0,0,0,0};
	private int timeSlice = 5;
	private int endLoop = 0;
	private int i = 0;
//private variables end.

//public methods start.
	public void completionTime(){

//loop through both arrays of class. update each value in both arrays. increment each value //of timer array by 5. and decrease each value of processBurst array by 5. last value of //processBurst is checked if decrementing it by 5 is less than or greater than 0. if it is //greater than zero then normal actitvities happen(adding and subtracting 5 in that index //of both arrays respectively). But if last value of processBurst is less than zero then //the value subtracted
		while(endLoop != 4){
			if((processBurst[i] - timeSlice) > 0){timer[i] = timer[i] + timeSlice; processBurst[i] = processBurst[i] - timeSlice;}

			else{if(processBurst[i] != 0 &&(processBurst[i] - timeSlice) == 0){timer[i] = timer[i]+timeSlice; processBurst[i] = processBurst[i]+timeSlice; 			endLoop = endLoop + 1;}

			else if(processBurst[i] > 0 && (processBurst[i] - timeSlice) == 0){timer[i] = timer[i] + processBurst[i]; processBurst[i] 					= 0; endLoop = endLoop+1;}
			
			else{break;}
}
		i++;	
}//for loop ends here.


for(int i =0; i <4 ; i++){System.out.println(processBurst[i]); System.out.print(timer[i]);}
}//method ends here.


}//class ends here.


public class main{
	public static void main(String [] args){
		Processes processes = new Processes();
		processes.completionTime();
}
}