
public class BreakTest {
	public static void main(String[] args) {
	
		int num=1;
		int sum=0;
		while(true){
			
			if(sum>5000){
				break;
			}
			else {
				sum+=num;
				num++;
			}
		}
		System.out.println(sum);
	}
}
