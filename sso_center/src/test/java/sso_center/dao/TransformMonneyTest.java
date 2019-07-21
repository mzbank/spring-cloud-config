package sso_center.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sso_center.SsoCenter;

@SpringBootTest(classes = SsoCenter.class)
@RunWith(SpringRunner.class)
public class TransformMonneyTest {

    @Autowired
    private TransformMonney transformMonney;

    @Test
    public void TransformMoney(){
        int money = transformMonney.addMoney(1, 100);
        System.out.println(money);
    }

    @Test
    public void incMoney(){
        int money = transformMonney.incMoney(2, 100);
        System.out.println(money);
    }
}