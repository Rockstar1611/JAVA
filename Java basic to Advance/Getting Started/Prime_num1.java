package preplnsta;

public class Prime_num1 
{
	boolean CheckPrime(int n)
	{
		if(n==0 ||n==1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(i==2)
			{
				return true;
			}
			else if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}