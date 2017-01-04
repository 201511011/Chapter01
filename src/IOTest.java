import java.util.Scanner;

public class IOTest {
	   
	public static void main(String[] args) {

			Scanner scanner = new Scanner( System.in );
			//줄만 바꿀 때
			String string1= scanner.nextLine();
			System.out.println(string1);
//			//System.out.print("Hello World를 반복할 수를 입력하세요 :");
//			int count1= scanner.nextInt();
//			int count2 = scanner.nextInt();
//			System.out.println(count1+ ":" +count2);
//			int i=1;
//			// Q: 아래 while 반복문을  사용하여  “Hello World”를 입력 받은 수 만큼 출력 하세요.
//		    while(count1!=0){
//		    	
//		    	System.out.println(i+".Hello World");
//		    	count1--;
//		    	i++;
//		    }
		    scanner.close();
	   
	   
	   }		

}
