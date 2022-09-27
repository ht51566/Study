package co06_enum;


public class Login {
	
	LoginResult login(String id, String password) {
		if(id.equals("ace") && password.equals("1234")) {
			//return "suces";
			return LoginResult.LOGIN_SUCCESS;
		}else {
			return LoginResult.LOGIN_FAILED;
		}
	}
	
	public static void main(String[] args) {
		Login login = new Login();
		LoginResult result = login.login("ace", "123");
		System.out.println(result);
		System.out.println(result.getName());
	}
}
