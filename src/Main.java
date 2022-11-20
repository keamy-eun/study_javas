import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
1) 문제파악 
문제
상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

출력
첫째 줄에 상수의 대답을 출력한다.

2) 유추파악
첫줄에 공백을 기준으로 두 개의 세자리 정수가 주어진다. 세자리 정수는 역순으로 배열된 후 큰 수를 출력한다.


3) 주요 단어 이름 선정
입력 str = input_str

4)테스트 케이스
<출력>
734 893
--> 437

221 231
--> 132

839 237
--> 938



5)프로그래밍 순서

*/

public class Main {
    public int A(String input_str){
        StringTokenizer st = new StringTokenizer(input_str," "); // 공백을 기준으로 문자열 구분
        ArrayList<String> arrayList = new ArrayList<>();
        while(st.hasMoreTokens()==true){
            arrayList.add(st.nextToken());
        }
        int size=arrayList.size();
        return size;
    }
    public static void main(String[] args) {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        try {
            Main main = new Main();
            int size = main.A(br.readLine());
            bw.write(size+"\n");
            br.close();
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}