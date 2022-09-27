package co08_singleton;

public class DBEx {
	public static void main(String[] args) {
		//DBConnectionKey obj = new DBConnectionKey();
		DBConnectionKey obj1 = DBConnectionKey.getInstance();
		DBConnectionKey obj2 = DBConnectionKey.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같넹~~~");
		}else {
			System.out.println("다르넹~~~");
		}
	}
}
