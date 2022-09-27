package mm;

//DTO - 회원 객체를 찍어내기 위한 틀 - 회원 데이터
public class Member {
	
	//field - data
	private String id;
	private String password;
	private String name;
	private int age;
	private boolean login;
	
	public Member(String id, String password, String name, int age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLogin() {
		return login;
	}
	//로그인 상태를 반대로 바꿔주는 일종의 toggle 메소드
	public void setLogin() {
		this.login = !login;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", login=" + login
				+ "]";
	}
}
