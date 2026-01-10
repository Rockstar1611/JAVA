package preplnsta;

public class positive_Negative {

	public static void main(String[] args) {
//Method-1
		int num=0;
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
// method-2
		int N=-2;
		if(N>=0)
		{
			if(N==0)
			{
				System.out.println("Zero");
			}
			else {
				System.out.println("Positive");
			}
		}
		else {
			System.out.println("Negative");
		}
//Method-3
		int n=21;
		if(n==0)
		{
			System.out.println("Zero");
		}
		else {
			String result = n > 0 ? "Positive" : "Negative";
			System.out.println(result);
		}
	}

}
