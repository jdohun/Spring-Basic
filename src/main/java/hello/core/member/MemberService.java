package hello.core.member;

import java.util.List;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
