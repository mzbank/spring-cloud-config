package sso_center.service;

import sso_center.pojo.TG_User;

public interface UserRegisteService {

    TG_User findByName(String name);

    boolean UserRegisterService(TG_User user);
}
