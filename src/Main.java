import java.util.Scanner;

public class Main{
    public int plus(int input_A,int input_B){
        // 두 정수의 합 구하기
        int plus_AB = input_A + input_B;
        return plus_AB;
    }
    
    public static void main(String[] args) {
        /* 
        1) 문제파악 
        두 정수 A,B 입력받고 A+B 출력
        2) 유추파악
        정수A,B입력 >> A+B 출력
        3)주요단어 이름 선정
        테스트 케이스 개수 = input_T 입력 : input_A, input_B, 출력: plus_AB
        4)테스트 케이스
        5
        1 1 = 2
        2 3 = 5
        3 4 = 7
        9 8 = 17
        5 2 = 7 
        5)프로그래밍 순서
        입력 - 처리 - 출력
        */
        Scanner scanner = new Scanner(System.in);
        //입력
        int input_T = scanner.nextInt();
        //처리
        Main main = new Main();
        for(int i=0; i<input_T; i++){
        int input_A = scanner.nextInt();
        int input_B = scanner.nextInt();
        //출력
        System.out.println(main.plus(input_A, input_B));
        }
        
        scanner.close();
    }
}
