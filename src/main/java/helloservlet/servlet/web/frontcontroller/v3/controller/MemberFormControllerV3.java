package helloservlet.servlet.web.frontcontroller.v3.controller;

import helloservlet.servlet.web.frontcontroller.ModelView;
import helloservlet.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> parmMap) {
        return new ModelView("new-form");
    }
}
