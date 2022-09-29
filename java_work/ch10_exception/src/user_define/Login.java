package user_define;

public class Login {
	
	public static void main(String[] args) {
		
		try {
			login("wow", "1234");
		} catch (NoIDException e) {
			System.out.println(e.getMessage());
			return;
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
			return;
		}
				
		System.out.println("Program End, 로그인 됐다 ㅋㅋㅋ");
	}

	private static void login(String id, String password) throws NoIDException, WrongPasswordException {
		if(!id.equals("wow")) {
			//id 불일치시 익셉션 발생(NoIDException)
			throw new NoIDException("no such ID ~~");
		}
		if(!password.equals("1234")){
			//id는 맞았지만 password 불일치시 익셉션 발생(WrongPasswordException)
			throw new WrongPasswordException("wrong password ~~");
		}
	}
}	
