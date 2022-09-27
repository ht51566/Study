package co09_dto.ex;

public class AccountService {
	
	//DB
	private Account[] list = new Account[100];

	// 객체 싱글톤으로 반환
	private static AccountService instance;
	private AccountService() {
		for(int i = 0; i < 5; i++) {
			list[i] = new Account("ace"+i, "ace"+i, "ace"+i, i* 10000);
		}
	}
	public static AccountService getInstance() {
		if (instance == null) {
			instance = new AccountService();
		}
		return instance;
	}
	
	//계좌 생성 메소드 - 계좌 정보를 받아서 계좌 생성하여 계좌 배열의 빈 자리에 넣고 성공하면 1, 실패하면 0을 반환
	public int createAccount(String accountNo, String owner, String pwd, long balance) {
		//계좌 생성 결과를 반환하기 위한 변수
		int result = 0;
		//계좌 리스트(배열)에서 하나씩 꺼낸다
		for(int i = 0; i <= list.length; i++) {
			//꺼낸 칸에 아무 것도 없으면 
			if(list[i] == null) {
				//전달받은 계좌정보로 계좌 객체를 생성하여 그 칸에 넣는다 
				list[i] = new Account(accountNo, owner, pwd, balance);
				//성공했다는 걸 알려주려고 result 값을 1로 바꿔줌
				result = 1;
				//계좌를 만들어서 저장했으므로 더 이상 다음 칸들을 꺼내볼 필요가 없으므로 for문 종료
				break;
			}
		}
		return result;
	}
	
	//계좌 잔고 조회
	public Account checkAccount(String accountNo) {
		Account acc = findAccount(accountNo);
		return acc;
	}
	
	//입금
	public Account deposit(String accountNo, long money) {
		Account acc = findAccount(accountNo);
		if(acc != null) {
			acc.setBalance(acc.getBalance() + money);
		}
		return acc;
	}
	
	//출금
	public Account withdraw(String accountNo, long money) {
		Account acc = findAccount(accountNo);
		if(acc != null) {
			if(acc.getBalance() >= money) {
				acc.setBalance(acc.getBalance() - money);
				return acc;
			}else {
				System.out.println("잔액 부족");
				return acc;
			}
		}
		return acc;
	}
	
	//송금
	//public String transit(String accountNo_from, String accountNo_to, long money) {
		public Account[] transit(String accountNo_from, String accountNo_to, long money) {
		//String result = "";
		Account[] result = new Account[2];
		Account acc1 = findAccount(accountNo_from);
		Account acc2 = findAccount(accountNo_to);
		if(acc1 != null && acc2 != null) {
			if(acc1.getBalance() >= money) {
				acc1.setBalance(acc1.getBalance() - money);
				acc2.setBalance(acc2.getBalance() + money);
				//result = acc1.getAccountNo()+"로부터 " + acc2.getAccountNo()+"에게 " + money + " 이체 완료!"; 
				result[0] = acc1; 
				result[1] = acc2;
			
			}
//			else {
//				//result = "이체 실패, 잔고가 부족합니다.";
//				result = "이체 실패, 잔고가 부족합니다.";
//			}
//		}else {
//			result = "이체 실패, 계좌 번호 오류";
		}
		return result;
	}
	
	/* 계좌 존재여부 확인 method */
	Account findAccount(String accountNo) {
		Account acc = null;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				if (list[i].getAccountNo().equals(accountNo)) {
					acc = list[i];
					break;
				}
			}
		}
		return acc;
	}
	

	

}
