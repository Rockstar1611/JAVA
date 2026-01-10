package preplnsta;

import java.util.Scanner;

class AutoMorphic{
	static int detectAutoMorphic(int num)
	{
		int square=num*num;
		while(num!=0)
		{
			if(num%10 == square%10)
			{
				return 0;
			}
			num=num%10;
			square=square%10;
		}
		return 1;
	}
}
public class AutoMorphic_Number {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
	    int res=AutoMorphic.detectAutoMorphic(num);
		if(res==1)
		{
			System.out.println("Enter  number "+num+" is AutoMorphic");
		}
		else {
			System.out.println("Enter  number "+num+" is not AutoMorphic");
		}
		
//Method 2
	int n = 376, sq = n * n ;
    if(isAutomorphic(n) == 1)
        System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
    else
        System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
	   
	//Method-3
    int x=5;
    int y=x*x;
    if(y%10==x%10)
        System.out.println("automorphic");
    else
        System.out.println("not");
	}
	
	static int isAutomorphic(int n){
    int square = n * n;
    while(n != 0)
    {
        // means not automorphic number
        if(n % 10 != square % 10){
            return 0;
        }
        // reduce down numbers
        n /= 10;
        square /= 10;
    }
    // if reaches here means automorphic number
    return 1;
}
}