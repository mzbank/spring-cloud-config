package sso_center.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sso_center.dao.TransformMonney;
import sso_center.service.TransfromMoneyService;

@Service
public class TransferMoneyImpl implements TransfromMoneyService {

    @Autowired
    private TransformMonney transformMonney;

    @Transactional
    @Override
    public void transformMoney(int from, int to, int money) {
        transformMonney.addMoney(1,money);
        transformMonney.incMoney(2,money);
    }
}
