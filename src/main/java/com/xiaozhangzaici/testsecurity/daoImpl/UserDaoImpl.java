package com.xiaozhangzaici.testsecurity.daoImpl;

import com.xiaozhangzaici.testsecurity.dao.UserRepository;
import com.xiaozhangzaici.testsecurity.domain.Role;
import com.xiaozhangzaici.testsecurity.domain.UserInfo;
import com.xiaozhangzaici.testsecurity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserRepository {
    @Autowired
    UserMapper mapper;

    public UserInfo getUserByUsername(String username) {
        return mapper.getUserByUsername(username);
    }

    public List<Role> getRolesByUsername(String username) {
        return mapper.getRolesByUsername(username);
    }
}
