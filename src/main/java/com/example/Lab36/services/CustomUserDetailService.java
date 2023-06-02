package com.example.Lab36.services;

import com.example.Lab36.entity.CustomUserDetail;
import com.example.Lab36.entity.User;
import com.example.Lab36.reponsitory.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService {
    @Autowired
    private IuserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException("user not found");
        return new CustomUserDetail(user, userRepository);
    }
}
