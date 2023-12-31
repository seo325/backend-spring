package helloservlet.servlet.web.frontcontroller.v2;

import helloservlet.servlet.domain.member.Member;
import helloservlet.servlet.domain.member.MemberRepository;
import helloservlet.servlet.web.frontcontroller.Myview;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV2 implements ControllerV2{

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age =Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        request.setAttribute("member", member);

        return new Myview("/WEB-INF/views/save-result.jsp");
    }
}
