import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* 
문제
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

출력
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
2) 유추파악
정수가 주어지고 5와 3을 사용해서 나눠 떨어지해라. 단, 5를 우선으로 사용한다. 
나눠떨어지지 않으면 -1을 출력.

3) 주요 단어 이름 선정
정수 N
봉지갯수 result

4)테스트 케이스
<출력>
18
--> 4

4
--> -1

6
--> 2

9
--> 3

11
--> 3

5)프로그래밍 순서
정수 N 입력 - 5를 나눴을때 나머지가 0,1,2,3,4 인 경우로 나눈다.
0인 경우 - 5만 사용한다.
1인 경우 - (5로 나눈 몫 -1) + 3을 2번 사용
2인 경우 - N이 12이상일때 =>(5로 나눈 몫 -2) + 3을 4번 사용
        N이 12이상이 아닐때 => -1 출력
3인 경우 -  5로 나눈 몫+ 3을 1번 사용
4인 경우 -  N이 9이상일때 =>(5로 나눈 몫 -1) + 3을 3번 사용
        N이 9이상이 아닐때 => -1 출력
*/

public class Main {
    public int A(int N){
        int result = 0;
        if(N%5==0){
            result = N/5;
        } else if(N%5==1){
            result = N/5-1+2; 
        }else if(N%5==2){
            if(N>=12) result = N/5-2+4;
            else result = -1;
        }else if(N%5==3){
            result = N/5+1;
        }else if(N%5==4){
            if(N>=9) result = N/5-1+3;
            else result = -1;
        }
        return result;
    }
        public static void main(String[] args) {     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            Main main = new Main();

            bw.write(main.A(N)+"\n");
            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}