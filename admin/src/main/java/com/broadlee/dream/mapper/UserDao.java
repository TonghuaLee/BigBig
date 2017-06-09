package com.broadlee.dream.mapper;

import com.broadlee.dream.common.BaseDao;
import com.broadlee.dream.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface UserDao extends BaseDao<User> {

    /**
     * 根据用户Id查询用户对象
     */
    User readUserById(Long id);

    /**
     * 根据手机号查询用户对象
     */
    User readUserByPhone(String phone);

    int insertUser(User user);

    int updatePassword(@Param("passwd") String passwd, @Param("id") Long id);

    String readPhoneById(Long id);

    List<User> readAllUsers();

    int updateAvatarUrl(@Param("id") Long id, @Param("newurl")String newurl);
    int updateNickname(@Param("id") Long id, @Param("newname")String newname);


}
