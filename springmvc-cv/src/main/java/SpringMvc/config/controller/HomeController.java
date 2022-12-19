package SpringMvc.config.controller;

import SpringMvc.config.model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index (Model model) {
        model.addAttribute("contact",new Contact());
        return "index";
    }



    @PostMapping("/contact")
    public String printContact(@ModelAttribute("contact") Contact contact, BindingResult result) {
        System.out.println(contact);
        return "index";
    }

}
