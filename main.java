class ReverseString{
	private String name = "Hello my name is anas";
	public void reverseName(){
		for(int i = (name.length()-1); i >=0 ; i--){
			System.out.println(name.charAt(i));
}
}
}


public class main{
	public static void main(String args[]){
		ReverseString reverse = new ReverseString();
		reverse.reverseName();
}
}