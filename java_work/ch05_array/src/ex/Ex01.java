package ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String[] question = { "당신의 이름은? ", "가고 싶은 나라는?", "먹고 싶은 음식은?", "원하는 일정은?" };

		String[][] tour = {
				// {"예: 손예림"},
				// 나라 선택지
				{ "싱가포르", "영국", "스위스", "프랑스", "이탈리아" },
				// 음식 선택지
				{ "스콘", "빠네수프", "크렘브륄레", "파스타", "크로와상" },
				// 일정 선택지
				{ "1박 2일", "2박 3일", "4박 5일", "5박 6일" } };

		String[][] schedule = new String[5][4];

		Scanner sc = new Scanner(System.in);
		String answer;
		boolean flag = true;
		int num = 0;
		while (flag) {
			System.out.println("여행 계획 입력할 거임??? y or n");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("n"))
				break;

			for (int i = 0; i < question.length; i++) {
				System.out.printf("Q%d: %s", i + 1, question[i]);
				if (i > 0) {
					System.out.println(Arrays.toString(tour[i - 1]));
				}
				answer = sc.nextLine();
				schedule[num][i] = answer;
			}
			num++;
			if (num == 5)
				break;
		}

		// System.out.println(Arrays.toString(schedule));
		if (schedule[0][0] != null) {
			System.out.println(">>>>> 여행 스케줄 <<<<<<");
			for (String[] mem : schedule) {
				if (mem[0] != null) {
					System.out.println(Arrays.toString(mem));
					System.out.println("------------------------------");
				}
			}
		} else {
			System.out.println("입력된 여행 계획이 없습니다.");
		}
		sc.close();
	}
}
