import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* 
문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다

2) 유추파악


3) 주요 단어 이름 선정


4)테스트 케이스
<출력>
72
--> 
2
2
2
3
3

3
--> 
3

6
--> 
2
3

2
--> 
2

9991
--> 
97
103

5)프로그래밍 순서

*/

public class Main {
    // 정수 N을 파라미터로 넣으면 N의 소인수분해 값이 ArrrayList에 저장되어 리턴하는 함수
    public ArrayList<Integer> A(int N){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 2;
        while(i<=N){
            if(N%i ==0) {
                arrayList.add(i);
                N = N/i;
            }
            else i++;
        }
        return arrayList;
    }
        public static void main(String[] args) {     
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            
            Main main = new Main();
            ArrayList<Integer> arrayList = main.A(N);

            for(int i=0; i<arrayList.size(); i++) {
                bw.write(arrayList.get(i)+"\n");
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}