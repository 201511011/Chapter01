
public class Gugudan {
	public static void main(String[] args) {
		int i=1;
		
		while(i<=9){
			int k=1;
			while(k<=9){
				System.out.print(k+"*"+i+"="+i*k);
				System.out.print("      ");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
