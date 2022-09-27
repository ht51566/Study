package co09_dto.ex;

import java.util.Scanner;

public class MemberEx {
	//웹브라우저 - 프론트엔드 역할 - 백엔드(서버)로 요청을 날리고 응답을 받아 사용자에게 보여줌
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		MemberService ms = new MemberService();
		//싱글톤으로 객체 받아옴
		MemberService ms = MemberService.getInstance();
		
		String id, password, name; 
		int age;
		boolean flag = true;
		Member member = null;
		int result;
		
		while (flag) {
			System.out.println("---------------------------------------------------------------");
			System.out.println(" regist(1) | login(2) | logout(3) | Member list(4) | quit(5)");
			System.out.println("---------------------------------------------------------------");
			
			int service = Integer.parseInt(sc.nextLine());
			
			switch(service) {
			
			//회원가입
			case 1:
				System.out.println("id>>> ");
				id = sc.nextLine();
				result = ms.idCheck(id); 
				if(result == 1) {
					System.out.println("사용할 수 없는 ID입니다");
					continue;
				}else {
					System.out.println("사용할 수 있는 ID입니다");
				}
				System.out.println("password>>> ");
				password = sc.nextLine();
				System.out.println("name>>> ");
				name = sc.nextLine();
				System.out.println("age>>> ");
				age = Integer.parseInt(sc.nextLine());
				result = ms.regist(id, password, name, age);
				if(result > 0) {
					System.out.println("회원 가입 성공");
				}else {
					System.out.println("회원 가입 실패, 관리자에게 문의 하셈 ㅋㅋㅋ");
				}
				break;
				
			//로그인
			case 2:
				System.out.println("id>>> ");
				id = sc.nextLine();
				System.out.println("password>>> ");
				password = sc.nextLine();
				member = ms.login(id, password);
				if(member == null) {
					System.out.println("로그인 실패, 다시 해보셈 ㅋㅋㅋ");
				}else {
					System.out.printf("%s님(%s) 환영합니다. 물건 좀 많이 사셈 ㅋㅋㅋ\n", member.getName(), member.getId());
				}
				break;
			
			//로그아웃
			case 3:
				System.out.println("id>>> ");
				id = sc.nextLine();
				member = ms.logout(id);
				if(member == null) {
					System.out.println("로그아웃 실패, 다시 해보셈 ㅋㅋㅋ");
				}else {
					System.out.printf("%s님(%s) 안녕 빠빠~ 담에 또 오셈 ㅋㅋㅋ\n", member.getName(), member.getId());
				}
				break;
				
			//회원 목록
			case 4:
				System.out.println("id>>> ");
				id = sc.nextLine();
							
				Member[] members = ms.getMembers(id);
				if(members != null) {
					for(Member mem : members) {
						if(mem != null) {
							System.out.println(mem);
						}else {
							continue;
						}
					}
				}else {
					System.out.println("로그인 한 회원만 이용할 수 있는 서비스입니다 ㅋㅋㅋ");
				}
				break;
				
			//프로그램 종료	
			case 5:
				System.out.println("프로그램을 종료하시겠냥? y or n >>>");
				String select = sc.nextLine();
				if(select.trim().toLowerCase().equals("y")) {
					flag = false;
				}else {
					System.out.println("그래, 잘 생각했어 계속 잘 해봐 ㅋㅋㅋ");
				}
					
			}
		}
		
		System.out.println("Program End, All data will be destroyed ㅋㅋㅋ");
		sc.close();
	}
}
