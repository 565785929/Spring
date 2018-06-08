package com.sajor.course.member.controller;

import com.sajor.course.member.model.User;
import com.sajor.course.member.service.UserService;
import org.apache.tools.ant.taskdefs.ManifestTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/selectUser")
    public String selectUser(@RequestParam(value = "user_id")Integer id, Model model){
        StringBuilder msg = new StringBuilder();
        msg.append("You Select User Id is: <br />");
        msg.append("id = " + id);
        model.addAttribute("msg", msg.toString());
        return "success";
    }
    /**
     * 跳转注册用户信息页面
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "registerUser";
    }
    /**
     * 注册用户信息的方法
     */
    @RequestMapping("/registerUser")
    public String registerUser(User user, Model model){
        userService.addUser(user);
        List<User> userList = userService.findAllUsers();
        model.addAttribute("user_list", userList);
        return "userList";
    }
    /**
     * 跳转所有用户信息页面
     */
    @RequestMapping("/toUserList")
    public String toUserList(Model model){
        List<User> userList = userService.findAllUsers();
        model.addAttribute("user_list", userList);
        return "userList";
    }
    /**
     * 删除用户信息的方法
     */
    @RequestMapping("/deleteUser")
    public String deleteUsers(String id, Model model){
        userService.deteleUser(id);
        List<User> userList = userService.findAllUsers();
        model.addAttribute("user_list", userList);
        return "userList";
    }
    /**
     * 跳转修改用户页面
     */
    @RequestMapping("/toEditUser")//跳转到用户编辑 jsp 页面
    public String toUserEdit(String id, Model model) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "editUser";
    }
    /**
     * 修改用户信息的方法
     */
    @RequestMapping("/editUser")
    public String editUser(User user, Model model) {
        //如果接收的用户 id 不为 0，则表示对该用户进行了修改
        userService.updateUser(user);
        List<User> userList = userService.findAllUsers();
        model.addAttribute("user_list", userList);
        return "userList";
    }

}
