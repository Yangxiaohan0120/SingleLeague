package com.example.SingleLeague.dao;

import com.example.SingleLeague.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Chris Yang
 * created 2022-08-17 18:55
 **/

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String password);
}
