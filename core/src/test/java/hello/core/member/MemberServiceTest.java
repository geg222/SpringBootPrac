package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest{
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        Member member = new Member(1L, "원준영", Grade.VIP);

        memberService.join(member);
        Member f1 = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(f1);
    }


}
