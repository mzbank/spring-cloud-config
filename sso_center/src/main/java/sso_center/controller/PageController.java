package sso_center.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class PageController {

    @Value("${age}")
    String b;

    @RequestMapping("/name")
    @ResponseBody
    public String sd(){
        return b;
    }
    @RequestMapping("/regpage")
    public String ShowRegPage(){
        return "user_register";
    }
}
