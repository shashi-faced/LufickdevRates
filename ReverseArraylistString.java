import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArraylistString {
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int n = 5;
 		ArrayList<String> list = new ArrayList<String>();
 		while(true) {
 			String input = sc.nextLine();
 			if(!input.equals("/n")) {
 			list.add(input);
 			}
 			else {
 				break;
 			}
 		}
        Collections.sort(list, Collections.reverseOrder());
 		System.out.println(list);
}
}	 