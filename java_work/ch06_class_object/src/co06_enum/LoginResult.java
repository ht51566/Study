package co06_enum;

//enum : Enumeration - 열거
public enum LoginResult {
	LOGIN_SUCCESS("로그인 성공"),
	LOGIN_FAILED("로그인 실패");
	
	final private String name;

	public String getName() {
		return name;
	}

	private LoginResult(String name) {
		this.name = name;
	}
}
