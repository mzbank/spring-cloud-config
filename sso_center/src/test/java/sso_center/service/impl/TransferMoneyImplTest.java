package sso_center.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sso_center.SsoCenter;

import static org.junit.Assert.*;

@SpringBootTest(classes = SsoCenter.class)
@RunWith(SpringRunner.class)
public class TransferMoneyImplTest {

    @Autowired
    private TransferMoneyImpl transferMoney;

    @Test
    public void transformMoney() {

        transferMoney.transformMoney(1,2,100);
    }
}