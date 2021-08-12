import java.util.Scanner;

public class NumberValidation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char[] ch = num.toCharArray();
		boolean valid = true;
		sc.close();
	
		if(ch.length == 10) {
			valid = isDigitOnly(ch);
		}
		else if (ch.length == 13)  {
			if(ch[0] == '+') {
				ch[0] = '0';
				valid = isDigitOnly(ch);
			}
			else valid = false;
		}
		else {
			valid = false;
		}
		if(valid) {
			System.out.println("Valid Number");
		}
		else {
			System.out.println("Invaild Number");
		}
	}
	
	private static boolean isDigitOnly(char[] number) {
		boolean flag = true;
		
		for(int i=0;i<number.length;i++) {
			flag = Character.isDigit(number[i]);
			if(!flag) {
				break;
			}
		}	
		return flag;
	}
}
