import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
문제
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

2) 유추파악

3) 주요 단어 이름 선정
input_num

4)테스트 케이스
<출력>
2 1 5
--> 4

5 1 6
--> 2

100 99 1000000000
--> 999999901


5)프로그래밍 순서
*/

public class Main {
    public String A(int input_num){
        boolean check = true;
        int n = 0;  //n번째 줄
        String result="";
        while(check){
            if(input_num<=n*(n+1)/2) break;
            else n++;
        }
        int n_num = input_num - n*(n-1)/2; // n번째 줄에서의 순서
        if(n%2==0){  // 짝수번째 줄 일때
            result = n_num+"/"+(n-n_num+1);
        } else if (n%2==1){  // 홀수번째 줄 일때
            result = (n-n_num+1)+"/"+n_num;
        }
        // System.out.println(input_num+"은 "+n+"번째줄에 "+n_num+"번째"+" 분수는 : "+result);
        return result;
    }
    public static void main(String[] args) {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int input_num = Integer.parseInt(br.readLine());
            Main main = new Main();

            bw.write(main.A(input_num)+"\n");
            br.close();
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}