package beans;

import java.lang.reflect.Member;

public class DataInfors {
    public MemberBean getDataWithMemberBean(){
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        
        return memberBean;
    }
    
}
