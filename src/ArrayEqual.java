
	public class ArrayEqual {
		public static void main(String[] args) {
			
			int[] a={10,20,30};
			int[] b={100,200,300};
			
			boolean result = equals(a,b);
			System.out.println(result);
			
		}
	
		public static boolean equals(int[] array1, int[] array2){
			
			if(array1==null){
				return false;
			}
			
			if(array2==null){
				return false;
			}
			
			if(array1.length!=array2.length){
				return false;
			}
			
			for(int i=0;i<array1.length;i++){
				if(array1[i]!= array2[i]){
					return false;
				}
			}
			return true;
			
		}
	
}

