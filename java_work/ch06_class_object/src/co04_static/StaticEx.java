package co04_static;

public class StaticEx {
	public static void main(String[] args) {
//		Static_Careful sc = new Static_Careful();
//		System.out.println(sc.field1);
//		System.out.println(sc.field2);
		
		System.out.println(Static_Careful.field2);
		Static_Careful sc = new Static_Careful();
		System.out.println(Static_Careful.field2);
	}
}
