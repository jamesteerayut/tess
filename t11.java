package t123;
import java.util.Scanner;
public class t11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.print("Input : ");
		str = scan.next();
		System.out.print("Output : ");
		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
