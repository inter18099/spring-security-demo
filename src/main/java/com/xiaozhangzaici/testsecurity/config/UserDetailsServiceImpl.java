package com.xiaozhangzaici.testsecurity.config;

import com.xiaozhangzaici.testsecurity.dao.UserRepository;
import com.xiaozhangzaici.testsecurity.domain.Role;
import com.xiaozhangzaici.testsecurity.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        UserInfo user = userRepository.getUserByUsername(username);
        List<Role> roles = userRepository.getRolesByUsername(username);
        Set<Role> set = new HashSet<Role>();
        for(Role r : roles) {
            set.add(r);
        }
        user.setRoles(set);
        List<String> roleList = new ArrayList<>();
        int i = 0;
        for(Role r : user.getRoles()) {
            roleList.add(r.getName());
            i++;
        }
        String[] roleArray = new String[roleList.size()];
        UserDetails userDetails = User.builder().username(user.getUsername()).password(user.getPassword()).roles(roleList.toArray(roleArray)).build();
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return userDetails;
    }

}