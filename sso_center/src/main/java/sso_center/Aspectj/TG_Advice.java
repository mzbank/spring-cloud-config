package sso_center.Aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TG_Advice {

    @Before("execution(* sso_center.service.impl.TransferMoneyImpl.transformMoney(..))")
    public void before(){

    }
    @After("execution(* sso_center.service.impl.TransferMoneyImpl.transformMoney(..))")
    public void after(){

    }
}
