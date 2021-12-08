package hu.nye.rft.tja.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    private static final String ROOT_MAPPING = "/";
    private static final String USER_PAGE_LOGIN = "/Login";
    private static final String USER_PAGE_INDEX = "/index";
    private static final String USER_PAGE_REGISTRATION = "/Registration";
    private static final String USERS_MODEL_KEY = "user";

    /**
     * Not yet complete
     * */
    @RequestMapping(USER_PAGE_INDEX)
    public String index() {
        return "index";
    }

    @RequestMapping(USER_PAGE_LOGIN)
    public String login() {
        return "Login";
    }

    @RequestMapping(USER_PAGE_REGISTRATION)
    public String registration() {
        return "Registration";
    }
}
