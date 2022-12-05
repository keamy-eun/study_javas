import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

/* 
문제
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 

단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

2) 유추파악
첫째줄에 M 둘째줄에 N을 입력한다. M<= 소수들 <=N 이고 소수들의 합과 소수들 중의 최소값을 구하라.
소수가 없을경우 -1 출력

3) 주요 단어 이름 선정
sum = 소수들의 합
min = 소수들 중 최소값

4)테스트 케이스
<출력>
60
100
--> 
620
61

64
65
--> 
-1


5)프로그래밍 순서
소수를 구하는 for문에서 범위를 i=M; i<=N 으로 작성하여 범위 내의 소수값을 구하고 ArrayList에 넣는다.
for문으로 ArrayList 인덱스들의 합을 구하고 컬랙션 최소값으로 최소값을 구한다.
*/

public class Main {
    // 정수 M,N이 주어질때 소수값 구하는 함수 . M<=소수들<=N 
    public ArrayList A(int M, int N){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=M; i<=N; i++){
            int num=0;
            for(int j=2; j<=N; j++){ 
                if(j>=i)break; // 자신의 값보다 큰 값으로 나누면 break;
                else if(num==1 || i%j==0) { // 소인수분해가 되면 num++
                    num ++; 
                    break;}                 
            }
            if(num==0 && i !=1) {  // 1은 소수가 아니므로 제외
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    // ArrayList 인덱스의 총 합과 최소값을 구하는 함수
    public String B(ArrayList<Integer> arrayList){
        String print = "-1";
        if(arrayList.size() !=0){
            int sum = 0;
            for(int i=0; i<arrayList.size(); i++){
                sum += arrayList.get(i);
            }
            int min = Collections.min(arrayList);
            print = sum + "\n" + min;
        }
        return print;
    }
        public static void main(String[] args) {     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            
            Main main = new Main();
            ArrayList<Integer> arrayList = main.A(M,N);
            String print = main.B(arrayList);
            
            bw.write(print+"\n");
            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}