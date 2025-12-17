package vn.ndcuong.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.ndcuong.laptopshop.domain.User;
import vn.ndcuong.laptopshop.service.UserService;

@Controller // MVC
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String ndcuong = this.userService.hanleHello();
        model.addAttribute("ndcuong", ndcuong);
        model.addAttribute("cuong", "from Model with controller");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {

        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User ndcuong) {
        System.out.println("Ndcuong" + ndcuong);
        return "hello";
    }

}
