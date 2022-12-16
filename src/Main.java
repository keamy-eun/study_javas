import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

/* 
1) 문제
2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.


2) 유추파악
첫 줄에 정수 N이 주어지고 둘째줄부터 정수 x, y가 공백을 구분자로 N줄 입력된다.
x의 오름차순으로 한줄씩 출력된다.
x가 중복일땐 y의 오름차순으로 출력된다.

3) 주요 단어 이름 선정

4)테스트 케이스
<출력>
5
3 4
1 1
1 -1
2 2
3 3
-->
1 -1
1 1
2 2
3 3
3 4

5)프로그래밍 순서
정수 N 입력 - for문(i<N)으로 StringTokenizer로 LinkedHashMap(key= x, value = y) 입력 -
x 
*/

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for(int i=0; i<N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                map.put(a, b);
            }
            
            bw.write("");
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}