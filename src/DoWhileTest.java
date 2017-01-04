import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int value = 0;
		
		do { 
			System.out.print("숫자입력[ 0 to quit ] >");  
			value = scanner.nextInt();
			total += value;
			System.out.println("총 값:"+total);
		} while(value != 0);
		scanner.close();
	}
}