package com.shah.snapin.controller;

import com.shah.snapin.entity.User;
import com.shah.snapin.servise.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class TestController {

    private final UserService userService;

    @GetMapping("/view")
    public String showAllEmployees(Model model) {
        List<User> allUsers = userService.getUsers();
        model.addAttribute("allUsers", allUsers);
        return "first-view";
    }
}
