import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 10^10000)

출력
첫째 줄에 A+B를 출력한다.

2) 유추파악
큰 정수 A와 B 의 합 출력

3) 주요 단어 이름 선정


4)테스트 케이스
<출력>
9223372036854775807 9223372036854775808
--> 
18446744073709551615

5)프로그래밍 순서
int 자리수가 10 이상일때 입력되지 않는다. String으로 입력 받은 다음 자리수가 10의 배수가 넘어갈 때마다 쪼개서 저장한다.
각 10자리 수를 나눠서 더한뒤 String으로 숫자를 붙힌다
10자리+10자리 = 11자리가 되는 경우 다음 10자리의 첫자리에 +1을 해준다
*/

public class Main {
        public static void main(String[] args) {     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            


            int a = Integer.parseInt(A);
            int b = Integer.parseInt(B);
            bw.write((a+b)+"\n");
            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}