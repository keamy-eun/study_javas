import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

/* 
문제
수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

입력
첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

출력
첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

제한
1 ≤ N ≤ 1,000,000
-10^9 ≤ Xi ≤ 10^9

2) 유추파악
첫줄에 정수 N이 주어지고 공백을 구분자로 정수가 N개 입력된다.
각 자리의 정수를 다른 자리 정수보다 큰 횟수를 공백을 구분자로 출력하라.

3) 주요 단어 이름 선정
입력한 정수의 배열 : oriList
oriList를 Set으로 만든것 : arrSet
arrSet을 오름차순정렬 후 Map으로 만든것 : arrMap

4)테스트 케이스
5
2 4 -10 4 -9
-->
2 3 0 3 1

6
1000 999 1000 999 1000 999
-->
1 0 1 0 1 0

5)프로그래밍 순서
정수 N 입력 - StringTokenizer로 정수를 N번 입력 받는다 - oriList 배열에 저장 -
oriList를 HashSet으로 변경하여 중복 제거 - 다시 list로 바꾸어 오름차순으로 배열 -
HashMap에 저장 - oriList를 HashMap의 key와 매치시켜 출력
*/

public class Main {
    static BufferedWriter bw;
    // 배열을 입력하면 압출좌표를 출력해주는 함수
    static void print(Integer[] oriList) throws IOException{
        // set으로 중복을 제거하고
        HashSet<Integer> arrSet = new HashSet<>(Arrays.asList(oriList));
        Integer[] newArr = arrSet.toArray(new Integer[0]);
        Arrays.sort(newArr);
        
        // map으로 값을 출력한다
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        for(int i =0; i<newArr.length; i++){
            arrMap.put(newArr[i], i);
        }

        for(int i=0; i<oriList.length; i++){
            if(i != oriList.length-1) bw.write(arrMap.get(oriList[i])+" ");
            else bw.write(arrMap.get(oriList[i])+"");
        }
    }

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            Integer[] oriList = new Integer[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0; i<N; i++){
                oriList[i] = Integer.parseInt(st.nextToken());
            }

            print(oriList);
            
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}