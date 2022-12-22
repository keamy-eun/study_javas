import java.util.StringTokenizer;

public class Prac {
    public static void main(String[] args) {
        String str = "전혀 아니다. 아니다. 보통이다.";
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
