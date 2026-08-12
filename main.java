class Flag{
	public void printFlag(){
		for(int i =0; i<20; i++){
			if(i<10){
				if(i%2!=0){
					for(int j =0; j < 30;j++){
						if(j<7 && j %2 !=0){
							System.out.print("*");}
						else if(j>=7){System.out.print("=");}

}
					System.out.println("");
}
				else if(i%2 == 0){
					for(int j =0; j<30;j++){
						if(j<7 && j%2 ==0 ){System.out.print						("*");}
						else if(j>=7){System.out.print("=");}
}
}
}
			else if(i>=10){
				for(int j = 0; j<30;j++){System.out.print("=");}
				System.out.println("");
}
}
}
}

public class main{
	public static void main(String args[]){
		Flag flag = new Flag();
		flag.printFlag();
}
}
