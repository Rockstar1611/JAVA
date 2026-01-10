package preplnsta;

public class Grater_3num {

	public static void main(String[] args) {
//Method -1
		int n1=322;
		int n2=42;
		int n3=546;
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+" is greater number");
		else if(n2>=n1 && n2>=n3)
			System.out.println(n2+" is greater number");
		else if(n3>=n1 && n3>=n3)
	
			System.out.println(n3+ " is greater number");
//Method -2
		int num1=344; int num2=32; int num3=-8855;
		int temp,result;
		temp=num1>num2 ? num1:num2;
		result=temp>num3 ? temp:num3;
		System.out.println(result+" is the grester number");
	}

}
