package preplnsta;

public class Even_Odd {

	public static void main(String[] args) {
//Method-1
	 int num=71;
	 if(num%2==0)
		 System.out.println("Even"); 
	 else
		 System.out.println("Odd");
	 
//Method-2
	 int N=34;
	 String status = N % 2 == 0 ? "Even" : "Odd";
	 System.out.println(status);
	}
}