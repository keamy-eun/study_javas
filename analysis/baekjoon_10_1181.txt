import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* 
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.


2) 유추파악
첫 줄에 정수 N이 입력되고 둘째 줄부터 단어가 한줄씩 N번 입력된다
입력된 단어들을 길이순서의 오름차순으로 출력한다. 
길이가 같은경우 알파벳순으로 출력한다.

3) 주요 단어 이름 선정


4)테스트 케이스
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
-->
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate

5)프로그래밍 순서
정수 N 입력 - 단어를 한줄씩 N번 입력 & set에 저장 - 이중 array에 set값 저장 & 단어정렬 - 출력

*/

public class Main {
    static ArrayList<String>[] arr;
    static HashSet<String> set;
    static BufferedWriter bw;
        // set값을 arr에 옮기면서 단어정렬
        static ArrayList<String>[] arrayFunc(HashSet<String> set){
            Iterator iter = set.iterator();
            while(iter.hasNext()){
                String str = iter.next()+"";
                arr[str.length()].add(str);
                Collections.sort(arr[str.length()]);
            }
            return arr;
        }

        // array 출력
        static void print(ArrayList<String>[] arr) throws IOException{
            for(int i=0; i<51; i++){  
                if(arr[i] == null) continue;
                for(int j=0; j<arr[i].size(); j++){
                    bw.write(arr[i].get(j)+"\n");
                }
            }
        }

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            set = new HashSet<>();
            arr= new ArrayList[51];
            for(int i=0; i<N; i++){
                set.add(br.readLine()); // set에 담아 중복을 제거
            }
            
            for(int i=0; i<51; i++){
                arr[i] = new ArrayList<>(); // 이중  array 객체 생성
            }

            arrayFunc(set);
        
            print(arr);

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}