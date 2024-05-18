package by.itclass.controllers;

import by.itclass.model.entities.User;
import by.itclass.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static by.itclass.constants.AppConstants.*;

@Controller
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping(ROOT_URL)
    public String root() {
        return INDEX_PAGE;
    }

    @GetMapping(ALL_USERS_URL)
    public String all(Model model) {
        var users = service.getAllUsers();
        model.addAttribute(USERS_LIST_ATTR, users);
        return USERS_PAGE;
    }

    @GetMapping(DEL_USER_URL)
    public String delete(
            @RequestParam(name = "id") int id) {
        service.deleteById(id);
        return INDEX_PAGE;
    }

    @GetMapping(ADD_USER_URL)
    public ModelAndView add() {
        var modelAndView = new ModelAndView(ADD_USER_PAGE, USER_ATTR, new User());
        return modelAndView;
    }

    @PostMapping(SAVE_USER_URL)
    public String save(@ModelAttribute(USER_ATTR) User user) {
        service.addUser(user);
        return "redirect:" + ALL_USERS_URL;
    }

    @PostMapping("/saveSecond")
    public String saveSecond(@RequestParam(name = "name") String name,
                             @RequestParam(name = "age") int age) {
        var user = new User(name, age);
        service.addUser(user);
        return "redirect:" + ALL_USERS_URL;
    }

    @GetMapping("/update")
    public ModelAndView update(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age") int age) {
        return new ModelAndView("update", USER_ATTR, new User(id, name, age));
    }
@PostMapping("/saveUpdate")
    public String saveUpd(@ModelAttribute(name = "user") User user) {
        service.update(user);
        return "redirect:" + ALL_USERS_URL;
    }
}
