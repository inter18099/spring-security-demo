package com.xiaozhangzaici.testsecurity.dao;

import com.xiaozhangzaici.testsecurity.domain.Role;
import com.xiaozhangzaici.testsecurity.domain.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    UserInfo getUserByUsername(@Param("username") String username);

    List<Role> getRolesByUsername(String username);
}
