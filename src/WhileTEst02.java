import java.util.Scanner;

public class WhileTEst02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int value = 1;
		int sum=0;
		
//		while(value!=0)
//			System.out.print("숫자입력[ 0 to quit ] >");  
//			value = scanner.nextInt();
//			total += value;
//			System.out.println("총 값:"+total);
//		}
//		
		
		while(true){
			System.out.println("숫자입력");
			value=scanner.nextInt();
			if(value==0){
				break;
			}
			sum+=value;
		}

	}
}

