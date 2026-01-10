package preplnsta;

public class Greater_number {

	public static void main(String[] args) {
//Method-1
		int num1=20;
		int num2=60;
		if(num1==num2)
			System.out.println("Both are equal");
		else if(num1> num2)
			System.out.println(num1+" is greater");
		else
			System.out.println(num2+" is greater");
//Method-2	
		int n1=32;
		int n2=28;
		if(n1==n2)
			System.out.println("Both are Equal");
		else {
			int temp = n1>n2 ? n1 : n2;
			System.out.println(temp+ " Is greater");
		}
//Method-3
		int N1=321;
		int N2=434;
		if(N1==N2)
			System.out.println("Both are equal");
		else
			System.out.println(Math.max(N1, N2)+" Is Grater");
	}

}
