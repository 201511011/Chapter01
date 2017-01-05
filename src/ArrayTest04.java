
public class ArrayTest04 {
	public static void main(String[] args) {
		
		Student s1= new Student();//같은 패키지안에 Student class가 존재하므로  import안 해도 됨.
		
		Student[] students = new Student[3];
		
		for(Student value:students){
			System.out.println(value);
		}
		System.out.println("---------------");
//		흔히 하는 실수
//		students[0].name="둘리";
		
		students[0]=new Student();
		
		students[0].name="둘리";
		for (Student s: students){
			System.out.println(s);
		}
		
		for(Student s : students){
			
			if(s!=null){
				System.out.println(s.name);
			}
		}
	}
}
