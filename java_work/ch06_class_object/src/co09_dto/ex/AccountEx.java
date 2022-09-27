package co09_dto.ex;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		AccountService as = AccountService.getInstance();
		String accountNo; String owner; String pwd; long balance, result, money;
		Account account = null;
		
		while (flag) {
			System.out.println("========================JAVA 은행에 어서오세요==================================");
			System.out.println("1. 계좌 생성  ||  2. 잔액 확인  ||  3. 입금  ||  4. 출금  ||  5.송금  ||  6. 프로그램 종료  ");
			System.out.println("===========================================================================");
			System.out.printf(">> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			//계좌 생성
			case 1:
				//계좌 정보 입력 받음
				System.out.println("accountNo>>> ");
				accountNo = sc.nextLine();
				System.out.println("owner>>> ");
				owner = sc.nextLine();
				System.out.println("pwd>>> ");
				pwd = sc.nextLine();
				System.out.println("balance>>> ");
				balance = Long.parseLong(sc.nextLine());
				//AccountService의 메소드 createAccount() 호출 
				//- 계좌정보를 매개변수로 넘겨줌 
				//- 리턴값을 result에 저장
				result = as.createAccount(accountNo, owner, pwd, balance);
				if(result > 0) {
					System.out.println("계좌 생성 완료");
				}else {
					System.out.println("계좌 생성 실패, 관리자에게 문의 하셈 ㅋㅋㅋ");
				}
				break;
			//잔고 확인
			case 2:
				System.out.println("accountNo>>> ");
				accountNo = sc.nextLine();
				account = as.checkAccount(accountNo);
				if(account != null) {
					System.out.println(account);
				}else {
					System.out.println("계좌번호 오류");
				}
				break;
			//입금
			case 3:
				System.out.println("accountNo>>> ");
				accountNo = sc.nextLine();
				System.out.println("money>>> ");
				money = Long.parseLong(sc.nextLine());
				account = as.deposit(accountNo, money);
				if(account != null) {
					System.out.println(account);
				}else {
					System.out.println("입금 실패, 관리자에게 문의하셈 ㅋㅋ");
				}
				break;
				
			//출금
			case 4:
				System.out.println("accountNo>>> ");
				accountNo = sc.nextLine();
				System.out.println("money>>> ");
				money = Long.parseLong(sc.nextLine());
				account = as.withdraw(accountNo, money);
				if(account != null) {
					System.out.println(account);
				}else {
					System.out.println("출금 실패, 관리자에게 문의하셈 ㅋㅋ");
					System.out.println(account);
				}
				break;
				
			//송금
			case 5:
				System.out.println("보내는 accountNo>>> ");
				String accountNo_from = sc.nextLine();
				System.out.println("받는 accountNo>>> ");
				String accountNo_to = sc.nextLine();
				System.out.println("money>>> ");
				money = Long.parseLong(sc.nextLine());
				//String processResult = as.transit(accountNo_from, accountNo_to, money);
				Account[] processResult = as.transit(accountNo_from, accountNo_to, money);
				System.out.println(processResult[0]);
				System.out.println(processResult[1]);
				break;
				
			//프로그램 종료	
			case 6:
				System.out.println("끝낼 거냐? y or n >>");
				String sel = sc.nextLine();
				if(sel.trim().toLowerCase().equals("y")) {
					flag = false;
				}else {
					System.out.println("그래, 잘 생각했어 계속 잘 해봐 ㅋㅋㅋ");
				}
				break;
			default:
				System.out.println("1~6 중 하나 선택해라, 좋은 말로 할 때~~~");
			}

		}
		System.out.println("프로그램 끝이다 잘 먹고 잘 살아라 ㅋㅋㅋ");
		sc.close();
	}
}
