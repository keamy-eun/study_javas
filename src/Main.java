import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 
문제
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.

입력의 마지막에는 0이 주어진다.

출력
각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.

제한
1 ≤ n ≤ 123,456

2) 유추파악
입력한 정수 N보다 크고 2N보다 작거나 같은 소수의 갯수를 구한다.
정수는 한줄씩 입력하고 마지막줄은 0을 입력한다.

3) 주요 단어 이름 선정
while에 참거짓 판단용 num
입력 input_num
소수 갯수 cnt

4)테스트 케이스
<출력>
1
10
13
100
1000
10000
100000
0
--> 
1
4
3
21
135
1033
8392

5)프로그래밍 순서
while문(0입력시 종료) -
에라토스테네스의 체에 for문 사용하여 N< i <=2N 범위로 소수의 갯수를 출력한다.
*/

public class Main {
    public static boolean[] check;
    public static void get_check(){
        // 소수 = false
        check[0]=check[1]=true;
        for(int i=2; i*i<check.length; i++){
            for(int j= i*i; j<check.length; j+=i){ // i*i 이전값은 이미 배제된다.
                if(check[j]==true) continue;
                else check[j] = true;
            }
        } 
    }
    //정수보다 크고 정수*2보다 같거나 작은 범위중 값이 false인 값을 count하는 함수
    public int A(int input_num){
        int cnt =0;
        for(int i=input_num+1; i<2*input_num+1; i++) {
            if(check[i]==false) cnt++;
        }
        return cnt;
    }
        public static void main(String[] args) {     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            Main main = new Main();
            int num = 1;
            while(num!=0){
                int input_num = Integer.parseInt(br.readLine());
                if(input_num == 0){
                    num = 0;
                    return;
                } else {
                    check = new boolean[(2*input_num)+1];
                    get_check();
                    bw.write(main.A(input_num)+"\n");
                    bw.flush();
                }
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}