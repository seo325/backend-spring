package helloservlet.servlet.springmvc.v1;

import helloservlet.servlet.domain.member.Member;
import helloservlet.servlet.domain.member.MemberRepository;
import helloservlet.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
@Controller
public class SpringMemberListControllerV1 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {
        List<Member> members = memberRepository.findAll();

        ModelAndView mv = new ModelAndView("members");
//        mv.getModel().put("members", members);
        mv.addObject("members", members);
        return mv;
    }
}