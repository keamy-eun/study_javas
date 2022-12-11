import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
문제
수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다. 
그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

출력
첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

둘째 줄에는 중앙값을 출력한다.

셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

넷째 줄에는 범위를 출력한다.

2) 유추파악
첫째줄에 홀수 N이 입력된다. 둘째줄부터 정수가 한줄씩 N번 입력된다
첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.

3) 주요 단어 이름 선정
홀수 입력 갯수 : N
산술평균 : data1
중앙값 : data2
최빈값 : data3
범위 : data4

4)테스트 케이스
<출력>
5
1
3
8
-2
2
-->
2
2
1
10

1
4000
-->
4000
4000
4000
0

5
-1
-2
-3
-1
-2
-->
-2
-2
-1
2

3
0
0
-1
-->
0
0
0
1

5)프로그래밍 순서
첫째줄에 홀수 N이 입력 - 둘째줄에 정수를 한줄씩 N번 입력
data1 = for문으로 (N개의 정수들의 합)/N 
data2 = 데이터 크기대로 오름정렬했을때 중간에 있는 값
data3 = 가장 많이 입력된 데이터 값 출력
data4 = 최대값 - 최소값 출력. 음수일 경우 확인하여 계산.
*/

// 산술평균 : N개의 수들의 합을 N으로 나눈 값. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
// 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
// 최빈값 : N개의 수들 중 가장 많이 나타나는 값. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
// 범위 : N개의 수들 중 최댓값과 최솟값의 차이
// N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int T = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            double sum = 0; //ArrayList 값들의 합 --> 평균에 사용
            for(int i =0; i<T; i++){
                int num = Integer.parseInt(br.readLine());
                list.add(num);
                sum += num;
            }
            bw.write(Math.round(sum/T)+"\n"); // 산술평균 출력

            Collections.sort(list);
            bw.write(list.get(T/2)+"\n");  // 중앙값 출력 . 시간 초과시 CountingArray 시도

            




            // bw.write(sum/T+"\n");
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}