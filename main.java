class Name{
	private String name_ = "anas";
	public void printHello(){
		System.out.println("Hello");
		System.out.println(name_);
}
}


public class Main{
	public static void main(String args[]){
		Name name = new Name();
		name.printHello();
}

}