package sebCzabak.quizDemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "First Controller");

        return "index";
    }
}
