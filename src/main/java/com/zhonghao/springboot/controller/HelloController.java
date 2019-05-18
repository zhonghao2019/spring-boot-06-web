package com.zhonghao.springboot.controller;

import com.zhonghao.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("name","zh");
        return "success";
    }

    @RequestMapping("/each")
    public String each(Map<String,Object> map) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("小琼",1));
        userList.add(new User("zh",2));
        userList.add(new User("小佳",1));
        map.put("userList",userList);
        return "each";
    }
}
