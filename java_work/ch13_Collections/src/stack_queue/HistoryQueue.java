package stack_queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HistoryQueue {

    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("도움말: help를 입력");
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println(">> ");
            String input = sc.nextLine().trim();
            
            //입력값이 없으면 다시 시작
            if("".equals(input)) {
                continue;
            }
            
            if(input.equalsIgnoreCase("exit")) {
                System.exit(0);
            }else if(input.equalsIgnoreCase("help")) {
                System.out.println("help - 도움말");
                System.out.println("exit - 종료");
                System.out.println("history - 최근 입렵한 명령 5개 출력");
                save(input);
            }else if(input.equalsIgnoreCase("history")) {
                int i = 0;
                Iterator it = q.iterator();
                while(it.hasNext()) {
                    System.out.println(++i + ": " + it.next());
                }
                save(input);
            }else {
                save(input);
            }
        }
    }

    private static void save(String input) {
        //queue에 명령어 저장
        if(!"".equals(input)) {
            q.offer(input);
        }
        if(q.size() > MAX_SIZE) {
            //Queue 타입이므로 가장 먼저 들어갔던 명령어가 삭제됨
            q.remove();
        }
        
    }
}
