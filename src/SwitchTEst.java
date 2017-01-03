
public class SwitchTEst {
	public static void main(String[] args) {
		int month=10, days=0;
		
		if(month==1) days=31;
		else if(month==2)days=28;
		else if(month==3)days=31;
		else if(month==4)days=30;
		else if(month==5)days=31;
		else if(month==6)days=30;
		else if(month==7)days=31;
		else if(month==8)days=30;
		else if(month==9)days=31;
		else if(month==10)days=30;
		else if(month==11)days=31;
		else if(month==12)days=30;
		else System.out.println("unexpected error happend");
		System.out.println("month : "+month+"  days : "+days);
		
	}
}
