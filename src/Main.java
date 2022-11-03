import java.util.Scanner;

public class Main{
    public int cal(int input_A,int input_B){
        // 두 정수의 곱 구하기
        int cal_AB = input_A*input_B;
        return cal_AB;
    }
    public static void main(String[] args) {
        /* 
        1) 문제파악 
        첫째 줄에 영수증에 적힌 총 금액 X
        둘째 줄에 영수증에 적힌 구매한 물건의 종류의 수 N
        이후 N개의 줄에 각 물건의 가격a와 개수 b가 공백을 사이에 두고 주어진다.
        구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes, 아니면 No를 출력
        2) 유추파악
        첫줄 정수 X
        둘째줄 정수 N
        셋째줄 정수 a
        넷째줄 정수 b
        총금액 일치 > Yes 아닐시 > No
        3)주요단어 이름 선정
        총금액= input_X 누적금액= sum 총갯수= input_N 물건가격= input_A단일갯수 input_B, 
        출력= Yes_No
        4)테스트 케이스
        260000
        4
        20000 5
        30000 2
        10000 6
        5000 8
        >>Yes
        5)프로그래밍 순서
        입력 - 처리 - 출력
        */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        //입력
        int input_X = scanner.nextInt();
        int input_N = scanner.nextInt();
        //처리
        Main main = new Main();
        for(int i=0; i<input_N; i++){
            int input_A = scanner.nextInt();
            int input_B = scanner.nextInt();
            sum += main.cal(input_A, input_B);
        }
        //출력
        if(sum==input_X) System.out.println("Yes");
        else System.out.println("No");    
    scanner.close();
    }
}


