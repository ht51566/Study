package co08_singleton;

//Design Pattern: 객체를 생성하는 방식
//싱글톤: 사용자가 여럿이어도 객체를 하나만 생성해서 사용하는 방식
public class DBConnectionKey {

	//private: 클래스 내부에서만 보이게 하는 접근제한자
	//private static DBConnectionKey instance = new DBConnectionKey();
	private static DBConnectionKey instance;
	
	//생성자
	private DBConnectionKey() {}
	
	public static DBConnectionKey getInstance() {
		//lazy ~~
		if(instance == null) {
			instance = new DBConnectionKey();
		}
		return instance;
	}
}
