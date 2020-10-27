package com.cqjtu.esp.service.impl;

import com.cqjtu.esp.constant.Authority;
import com.cqjtu.esp.constant.AuthorityName;
import com.cqjtu.esp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.cqjtu.esp.utils.AuthorityUtil.createGrantedAuthorities;

/**
 * SpringBoot UserDetails 服务实现类 实现权限列表加载
 *
 * @author suwen
 * @date 2020/2/26 下午12:20
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserService userService;

  @Autowired
  public UserDetailsServiceImpl(UserService userService) {
    this.userService = userService;
  }

  @Override
  public UserDetails loadUserByUsername(String userNo) {
    com.cqjtu.esp.entity.User user = userService.getById(userNo);
    List<Authority> authorities = new ArrayList<>();
    for (int i = user.getAuthority(); i >= 0; i--) {
      authorities.add(new Authority(1L, AuthorityName.valueOf(i)));
    }
    user.setAuthorities(authorities);
    return create(user);
  }

  private static User create(com.cqjtu.esp.entity.User user) {
    return new User(
        user.getUid().toString(),
        user.getPassword(),
        createGrantedAuthorities(user.getAuthorities()));
  }
}
