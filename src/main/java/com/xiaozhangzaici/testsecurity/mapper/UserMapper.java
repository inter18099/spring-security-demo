package com.xiaozhangzaici.testsecurity.mapper;

import com.xiaozhangzaici.testsecurity.domain.Role;
import com.xiaozhangzaici.testsecurity.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserInfo getUserByUsername(String name);

    List<Role> getRolesByUsername(String name);
}
