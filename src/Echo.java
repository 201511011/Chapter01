
public class Echo {
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args);
		
		for(String s: args){
			System.out.println(s);
		}
	}
}
