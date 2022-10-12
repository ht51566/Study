package file04_object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BookEx {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BookService bs = BookService.getInstance();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bs.restore();
		
		boolean flag = true;
		int select = 0;
		while (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println(" 1.도서 등록 | 2.도서 목록 ... | 5.프로그램 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.println("원하는 메뉴 >>>");
			try {
				select = Integer.parseInt(br.readLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자 써라 ㅋㅋㅋ");
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("code >>");
				String code = br.readLine();
				System.out.println("price >>");
				int price = Integer.parseInt(br.readLine());
				System.out.println("title >>");
				String name = br.readLine();
				System.out.println("author >>");
				String author = br.readLine();
				System.out.println("page >>");
				String page = br.readLine();
				BookInfo bi = new BookInfo(code, price, name, author, page);
				int result = bs.registBook(bi);
				if(result == 1 ) {
					System.out.println("저장 성공");
				}else {
					System.out.println("저장 실패");
				}
				break;
			case 2:
				List<GoodInfo> list = bs.bookList();
				for (GoodInfo g : list) {
					System.out.println("-----------------");
					System.out.println(g);
				}
			
				break;
			case 5:
				bs.save();
				flag = false;
			}
		}
	}
}
