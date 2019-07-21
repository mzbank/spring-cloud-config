package sso_center.dao;

import sso_center.pojo.TG_User;

public interface UserRegiste {

    TG_User findByName(String username);

    boolean UserRegister(TG_User user);

}
