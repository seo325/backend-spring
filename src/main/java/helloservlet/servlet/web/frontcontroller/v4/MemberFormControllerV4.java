package helloservlet.servlet.web.frontcontroller.v4;

import java.util.Map;

public class MemberFormControllerV4 implements Controller4{
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
