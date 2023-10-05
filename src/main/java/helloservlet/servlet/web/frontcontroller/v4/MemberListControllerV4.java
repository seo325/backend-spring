package helloservlet.servlet.web.frontcontroller.v4;

import helloservlet.servlet.domain.member.Member;
import helloservlet.servlet.domain.member.MemberRepository;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements Controller4{
    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);

        return "members";
    }
}
