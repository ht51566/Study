package ex;

import java.util.List;

public class BoardEx {
    
    public static void main(String[] args) {
        
        Board b1 = new Board("오늘", "happy", "aa");
        Board b2 = new Board("내일", "sunshine", "bb");
        Board b3 = new Board("모레", "점심시간이 다가오네 ㅋㅋㅋ", "cc");
        
        //BoardDao dao = new BoardDao();
        BoardDao dao = BoardDao.getInstance(); //싱글톤
        
        dao.setData(b1);
        dao.setData(b2);
        dao.setData(b3);
        
        List<Board> list = dao.getBoardList();
        for(Board b : list) {
            System.out.printf("글쓴이: %s / 제목: %s / 내용: %s \n", b.getWriter(), b.getTitle(), b.getContent() );
        }
    }
}
