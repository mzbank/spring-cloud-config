package sso_center.dao;

import org.apache.ibatis.annotations.Param;

public interface TransformMonney {

    int addMoney(@Param("id") int from, @Param("money") int money);
    int incMoney(@Param("id") int to, @Param("money") int money);
}
