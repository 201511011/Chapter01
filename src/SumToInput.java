import java.util.Scanner;

public class SumToInput {
		public static void main( String[] args ) {
		    // 코드를 완성합니다.    
			System.out.print("n을 입력하세요:");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			int sum=0;
			for(int n=1
					;n<=num;n++){
				sum+=n ;
			
			}
			System.out.println(sum);
	}

}
