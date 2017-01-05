
public class SumToInput02 {
	public static void main(String[] args) {
		
		if(args.length==0){
			System.out.println("usage : java SumToInput [number]");
			return;
		}
		
//		String -> int
		int num = Integer.parseInt(args[0]);
		
//		int -> String
		int n =10;
		String s = ""+n;
		String s1 = String.valueOf(n);
		
		System.out.println(s);
		int sum=0;

		for(int i=0;i<=num;i++){
			sum=sum+num;
	
		}
		
		System.out.println(sum);
		
		
	}
}
