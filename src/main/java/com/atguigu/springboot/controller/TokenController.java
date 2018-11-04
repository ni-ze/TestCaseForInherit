package com.atguigu.springboot.controller;


import com.atguigu.springboot.dto.LoginRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping(value = "oauth/v1.0")
public class TokenController {

	private static final Log LOG= LogFactory.getLog(TokenController.class);


	
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(
            @RequestBody LoginRequest loginRequest,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        if(loginRequest.getPassword() == null && loginRequest.getUsername() == null){
            return "IllegalArgumentException! Request failed:"+request.getServletPath();
        }

        LOG.info("request success on path:"+request.getServletPath());

        return "request success:"+request.getServletPath();
    }




}
