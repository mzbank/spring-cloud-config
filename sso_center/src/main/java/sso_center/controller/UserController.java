package sso_center.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sso_center.controller.VO.UserVO;
import sso_center.pojo.TG_User;
import sso_center.service.impl.UserRegisteServiceImpl;

@Controller
public class UserController {

    @Autowired
    private UserRegisteServiceImpl service;

    @RequestMapping(value = "/userservice",method = RequestMethod.POST)
    @ResponseBody
    public String UserRegiste(UserVO vo){

        TG_User user = new TG_User();
        boolean result = service.UserRegisterService(user);
        System.out.println(result);
        return "sdfdg";
    }
}
