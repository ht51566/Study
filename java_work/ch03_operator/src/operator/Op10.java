package operator;

public class Op10 {
    public static void main(String[] args) {
    	
    	//부동소수점 오류
    	float sum = 0.0f;
        for (int a = 0; a<100; a++){
            sum += 0.1f;
        }
        System.out.println(sum);
        
        //사과 1개 있네
        int apple = 1;
        //사과를 10개로 쪼갠 조각 1개
        double pieceUnit = 0.1;
        //사람수가 7명이네
        int num = 7;
        //사람이 각자 1조각씩 먹었네
        double result = apple - pieceUnit * num;
        System.out.println(result); //0.3
        
        //해결책 - 소수를 정수로 만들어서 연산하고 다시 소수로 환원
        //사과를 10개로 만듬
        int totalPieces = apple * 10;
        //1개씩 먹어서 7개 먹음
        int temp = totalPieces - num;
        //남은 3개를 10으로 나눔, int는 몫만 반환하므로 double로 나눔
        result = temp / 10.0;
        System.out.println(result );
        
        
        
    }


}
