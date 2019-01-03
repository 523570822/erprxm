package com.winter.Controller;

import com.winter.model.User;

import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller

@RequestMapping("/in")
public class UserController {

    @Autowired
   private UserService userService;

  @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){

        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
    @RequestMapping(value = "/qwe")
    public String qwe() {
        System.out.println("到了qwe");
        return "hello";
    }
  @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {

      System.out.println("到了hello");
        return "World123";
    }

}

