package com.dxw.controller;

import com.dxw.pojo.User;
import com.dxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String userLogin(User user, HttpSession session, Model model){

        boolean flag = false;

        User bookUser = userService.queryUserByName(user.getUsername());

        if (bookUser!=null){
            if (bookUser.getPassword().equals(user.getPassword())){
                session.setAttribute("bookUser",user);
                flag = true;
            }else {
                model.addAttribute("msg","密码不正确！");
            }
        }else {
            model.addAttribute("msg","用户不存在！");
        }

        //return flag?"redirect:book/allBook":"error";
        return flag?"redirect:/book/allBook":"error";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){

        if (session.getAttribute("bookUser")!=null){
            //退出登录移除session
            session.removeAttribute("bookUser");
        }

        return "login";
    }

}
