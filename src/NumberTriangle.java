import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("값을 입력하세요:");
//		int num=scan.nextInt();
		
		if(args.length==0){
			return;
		}
		
		int num = Integer.parseInt(args[0]);
		
		for(int i=1;i<=num;i++){
			
			for(int k=0;k<i;k++){
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
