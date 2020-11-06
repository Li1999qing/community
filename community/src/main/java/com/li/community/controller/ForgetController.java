package com.li.community.controller;

import com.li.community.entity.Page;
import com.li.community.entity.User;
import com.li.community.service.UserService;
import com.li.community.util.CommunityConstant;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/forget")
public class ForgetController implements CommunityConstant {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/change", method = RequestMethod.GET)
    public String forget( Model model, Page page ) {

        String email="1559593896@qq.com";
      List<User> myEmail = userService.findMyEmail(email);
      if (myEmail!=null){
            System.out.println("123456");
        }

        return "/site/forget";
    }
}
