package sso_center.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sso_center.SsoCenter;
import sso_center.pojo.TG_User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SsoCenter.class)
public class UserRegisteTest {

    @Autowired
    private UserRegiste registe;

    @Test
    public void findUser(){
        TG_User user = registe.findByName("zcl");
        System.out.println(user);
    }

    @Test
    public void UserRegister(){
        TG_User user = new TG_User();
        user.setName("ls"+"ww");
        user.setPassword("lsww"+123456);
        boolean result = registe.UserRegister(user);
        System.out.println(result);
    }
}