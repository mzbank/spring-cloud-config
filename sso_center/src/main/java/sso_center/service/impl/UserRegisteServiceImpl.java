package sso_center.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sso_center.dao.UserRegiste;
import sso_center.pojo.TG_User;
import sso_center.service.UserRegisteService;

@Service
public class UserRegisteServiceImpl implements UserRegisteService {

    @Autowired
    private UserRegiste registe;

    @Override
    public TG_User findByName(String username) {
        TG_User user = registe.findByName(username);
        return user;
    }

    @Override
    public boolean UserRegisterService(TG_User user) {
        boolean result = registe.UserRegister(user);
        return result;
    }

}
