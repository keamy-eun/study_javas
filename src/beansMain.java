import beans.DataInfors;
import beans.MemberBean;

public class beansMain {
    public static void main(String[] args) {
        DataInfors dataInfors = new DataInfors();
        MemberBean memberBean = dataInfors.getDataWithMemberBean();
        System.out.println(memberBean.getFirstName()+" "+memberBean.getSecondName()+" "+memberBean.getHandleName());

    }
}
