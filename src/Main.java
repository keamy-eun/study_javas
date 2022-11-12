import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
1) 문제파악 
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.
2) 유추파악
*점수들 중 최대값 M, (그 외 점수)/M*100
1. 정수 N 입력
2. 정수 N번 입력(여백 구분, 100이하, 전부 0 불가)
3. 위 정수/최대값*100의 평균 출력

3) 주요 단어 이름 선정
정수갯수N: input_N  
N개의 정수들: input_num
정수들 최대값: max
정수들 합: sum

4)테스트 케이스
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
--> 
10
9
7
55
30

5)프로그래밍 순서
정수 N 입력 - for문으로 N개의 (0~100)정수들 입력 - Arraylist에 담기 - 
정수들 최대값(max),합(sum) 구하기 - (sum*100)/(max*N) 출력
*/

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input_N;
        ArrayList<Integer> arraylist = new ArrayList<>();
        StringTokenizer st;
        try {
            input_N = Integer.parseInt(br.readLine());
            float sum = 0;
            int max = 0;
            st = new StringTokenizer(br.readLine(), " ");
            
            for(int i=0; i<input_N; i++){
                arraylist.add(Integer.parseInt(st.nextToken()));
                sum += arraylist.get(i); //합 구하기
                if(arraylist.get(i)>max) max = arraylist.get(i); //최대값 구하기
            }
            bw.write((sum*100)/(max*input_N)+"\n");  //평균 출력
            br.close();
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

            
    }
}