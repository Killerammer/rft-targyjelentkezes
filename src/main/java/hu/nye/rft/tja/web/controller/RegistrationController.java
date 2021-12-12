package hu.nye.rft.tja.web.controller;

import hu.nye.rft.tja.web.domain.UserView;
import hu.nye.rft.tja.web.service.UserServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Registration")
public class RegistrationController {

    private UserServiceInterface userServiceInterface;

    public RegistrationController(UserServiceInterface userServiceInterface) {
        super();
        this.userServiceInterface=userServiceInterface;
    }

    @ModelAttribute("user")
    public UserView userView() {
        return new UserView();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "Registration";
    }

    @PostMapping
    public String registrationForm(@ModelAttribute("user") UserView userView){
        userServiceInterface.save(userView);
        return "redirect:/Registration?success";
        //redirect:/registration?success
    }
}
