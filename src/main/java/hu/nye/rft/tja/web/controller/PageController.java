package hu.nye.rft.tja.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    private static final String ROOT_MAPPING = "/";
    private static final String USER_PAGE_LOGIN = "/login";
    private static final String USER_PAGE_REGISTRATION = "/registration";
    private static final String USERS_MODEL_KEY = "user";

    /**
     * Not yet complete
     * */
    @GetMapping(ROOT_MAPPING)
    public String homePage(Model model) {
        model.addAttribute(USERS_MODEL_KEY, userService.getAllUser());
        return USER_LIST_PAGE_NAME;
    }

    @RequestMapping(USER_PAGE_LOGIN)
    public String login() {
        return "login";
    }

    @RequestMapping(USER_PAGE_REGISTRATION)
    public String registration() {
        return "registration";
    }
}
