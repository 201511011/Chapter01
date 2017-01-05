import java.util.*;	// Scanner 클래스를 사용하기 위함
			
public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("값을 입력:");
		int n=scan.nextInt();
		int div=2;
		
		while(n>div){
			if(n%div==0){
				System.out.println("소수가 아닙니다");
				break;
			}
			
			div++;
			
			if(n==div){
				System.out.println("소수 입니다.");
			}
		}
		
		if(n==1||n==2){
			System.out.println("소수입니다");
			
		}
		
		
		
		
		
	}
}

