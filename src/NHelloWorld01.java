import java.util.Scanner;

public class NHelloWorld01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Hello World를 출력할 횟수를 입력하세요:");
		int count=scan.nextInt();

		for(int i=0;i<count;i++){
			System.out.println(i+1+".Hello World");
			
		}
		scan.close();
	}
}
