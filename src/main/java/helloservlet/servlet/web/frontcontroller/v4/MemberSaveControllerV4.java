package helloservlet.servlet.web.frontcontroller.v4;

import helloservlet.servlet.domain.member.Member;
import helloservlet.servlet.domain.member.MemberRepository;

import java.util.Map;

public class MemberSaveControllerV4 implements Controller4{

    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        model.put("member", member);
        return "save-result";
    }
}
