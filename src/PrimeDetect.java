import java.util.*;	// Scanner 클래스를 사용하기 위함
			
public class PrimeDetect {

   public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");
		int num = stdin.nextInt();
		int div =2; 
//	
//		while(div<num){
//			while()	
//				if(num%div==0){
//					System.out.println(num+"은 소수");
//				}
//				else System.out.println(num+"은 소수가 아니다.");
//				
//		}
//		
		while(num>div){
			while(num%div!=0){
				if(num%div==0){
					System.out.println(num+"은 소수가 아니다");
					break;
				}
				else{
					div++;
				}
			}
			System.out.println(num+"은 소수입니다.");
		}
    }	
}

