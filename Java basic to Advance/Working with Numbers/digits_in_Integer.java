package Level2;

public class digits_in_Integer {

	public static void main(String[] args) {
		int number=123456621;
		int digit=0;
		while(number!=0) {
			int pick_last=number%10;
			digit++;
			number=number/10;
		}
		System.out.println("Number if Digits= "+digit);
	}

}
