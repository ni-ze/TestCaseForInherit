package com.atguigu.springboot.dto;

import lombok.Data;

@Data
public class LoginRequest {
    
    private String username;
    
    private String password;
    
    private String systemId;
    
    private String userType;
    
}
