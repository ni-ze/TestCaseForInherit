package com.atguigu.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "oauth/v2.0")
public class TokenControllerV2 extends TokenController{

}
