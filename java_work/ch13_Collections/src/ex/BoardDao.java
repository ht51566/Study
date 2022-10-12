package ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    
    private static BoardDao instance;
    private BoardDao() {}
    public static BoardDao getInstance() {
        if(instance == null) {
            instance = new BoardDao();
        }
        return instance;
    }
 
    //데이터베이스 대용 리스트
    List<Board> list = new ArrayList<>();
    
    //DB에 데이터 저장
    void setData(Board board) {
        list.add(board);
    }
    
    //DB의 데이터 전체 조회
    List<Board> getBoardList(){
        return list;
    }
}
